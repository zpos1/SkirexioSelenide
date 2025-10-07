package tests;

import org.testng.annotations.Test;
import user.UserFactory;

public class LoginTest extends BaseTest {
    public LoginTest() {
        super();
    }

    @Test(description = "Проверка корректной авторизации")
    public void projectLogin() {
        loginPage.openPage(url)
                .login(UserFactory.withAdminPermision())
                .pressSubmit();
        homePage.waitPageLoading();
    }

    @Test(description = "Проверка авторизации с невалидным пользователем")
    public void incorrectLogin() {
        loginPage.openPage(url);
        loginPage.login(UserFactory.incorrectUser());
        loginPage.pressSubmit();
        loginPage.errorVisible();
    }
}
