package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import utils.PropertyReader;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class BaseTest {
    LoginPage loginpage;
    HomePage homePage;
    public String user;
    public String pass;
    String url;
    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://test.skyrexio.com/";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        loginpage = new LoginPage();
        homePage = new HomePage();
        user = PropertyReader.getProperty("skyrexio.user");
        pass = PropertyReader.getProperty("skyrexio.pass");
    }

    @AfterMethod
    public void closeWind() {
        clearBrowserCache();
        Selenide.closeWebDriver();

    }
}
