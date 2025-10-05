package tests;

import org.testng.annotations.Test;
import user.UserFactory;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {
    public LoginTest() {
        super();
    }

    @Test(description = "Проверка корректной авторизации")
    public void projectLogin() {
        loginpage.openPage();
        loginpage.login(UserFactory.withAdminPermision());
        loginpage.pressSubmit();
        homePage.waitPageLoading();
    }
    @Test
    public void openPage2() {
        loginpage.openPage();
        loginpage.login(UserFactory.withAdminPermision());
    }
}
