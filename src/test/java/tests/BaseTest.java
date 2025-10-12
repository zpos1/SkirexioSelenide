package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pages.*;
import utils.PropertyReader;
import utils.TestListener;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

@Listeners ({AllureTestNg.class, TestListener.class})
public class BaseTest {

    public String user;
    public String pass;
    public String url;
    public String terms;
    LoginPage loginPage;
    HomePage homePage;
    SubscriptionsPage subscriptionsPage;
    TermsPage termsPage;
    SmartTerminalPage smartTerminalPage;
    TelegramPage telegramPage;
    @Parameters("browser")
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            Configuration.browser = "chrome";
        } else if (browser.equalsIgnoreCase("edge")) {
            Configuration.browser = "edge";
        }
        ChromeOptions options = new ChromeOptions();
        Configuration.browserCapabilities = options;
        Configuration.headless = false;
        options.addArguments("--headless=new");
        Configuration.timeout = 10000;
        Configuration.baseUrl = url;
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 10000;
        Configuration.screenshots = true;

        loginPage = new LoginPage();
        homePage = new HomePage();
        subscriptionsPage = new SubscriptionsPage();
        termsPage = new TermsPage();
        smartTerminalPage = new SmartTerminalPage();
        telegramPage = new TelegramPage();
        user = PropertyReader.getProperty("skyrexio.user");
        pass = PropertyReader.getProperty("skyrexio.pass");
        url = PropertyReader.getProperty("skyrexio.url");
        terms = PropertyReader.getProperty("terms.url");
    }

    @Step("Закрытие браузера")
    @AfterMethod
    public void closeWind() {
        clearBrowserCache();
        Selenide.closeWebDriver();
    }
}
