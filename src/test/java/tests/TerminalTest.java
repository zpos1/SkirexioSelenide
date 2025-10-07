package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import user.UserFactory;

public class TerminalTest extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(TerminalTest.class);

    @Test(description = "Переход на страницу Терминала")
    public void projectLogin() {
        loginPage.openPage(url)
                .login(UserFactory.withAdminPermision())
                .pressSubmit();
        homePage.waitPageLoading()
                .pressTerminalButton()
                .pressSmartTerminalButton();
        smartTerminalPage.SmartTerminalPageExist();
    }
}
