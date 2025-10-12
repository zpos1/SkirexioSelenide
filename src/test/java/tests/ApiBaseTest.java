package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utils.PropertyReader;

public class ApiBaseTest {
    public String devUrl;
    public String loginJson;
    public String passJson;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser) {
        loginJson = PropertyReader.getProperty("skyrexiologin.json");
        passJson = PropertyReader.getProperty("skyrexiopass.json");
        devUrl = PropertyReader.getProperty("devskyrexio.url");
    }
}
