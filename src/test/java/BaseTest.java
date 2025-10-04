import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class BaseTest {
    LoginPage loginpage;
    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://test.skyrexio.com/";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        loginpage = new LoginPage();
    }

    @AfterMethod
    public void closeWind() {
        clearBrowserCache();
        Selenide.closeWebDriver();

    }
}
