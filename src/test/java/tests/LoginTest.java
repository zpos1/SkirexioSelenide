package tests;

import org.testng.annotations.Test;
import user.UserFactory;

public class LoginTest extends BaseTest {
    public LoginTest() {
        super();
    }

    @Test(description = "Проверка корректной авторизации")
    public void projectLogin() {
        loginpage.openPage(url);
        loginpage.login(UserFactory.withAdminPermision());
        loginpage.pressSubmit();
        homePage.waitPageLoading();
    }

    @Test(description = "Проверка авторизации с невалидным пользователем")
    public void incorrectLogin() {
        loginpage.openPage(url);
        loginpage.login(UserFactory.incorrectUser());
        loginpage.pressSubmit();
        loginpage.loginpageVisible();
    }
}
