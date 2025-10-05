package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.HomePage;
import pages.LoginPage;
import pages.SubscriptionsPage;
import pages.TermsPage;
import utils.PropertyReader;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class BaseTest {
    LoginPage loginpage;
    HomePage homePage;
    SubscriptionsPage subscriptionsPage;
    TermsPage termsPage;
    public String user;
    public String pass;
    public String url;
    public String terms;


    @Parameters("browser")
    @BeforeMethod
    public void setUp() {
        if (browser.equalsIgnoreCase("chrome")) {
            Configuration.browser = "chrome";
        } else if (browser.equalsIgnoreCase("edge")) {
            Configuration.browser = "edge";
        }
        Configuration.headless = false;
        Configuration.timeout = 10000;
        Configuration.baseUrl = url;
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 20000;

        loginpage = new LoginPage();
        homePage = new HomePage();
        subscriptionsPage = new SubscriptionsPage();
        termsPage = new TermsPage();
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
