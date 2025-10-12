package tests;

import org.testng.annotations.Test;
import user.UserFactory;

public class OpenTelegramTest extends BaseTest {
    @Test(description = "Открытие телеграм канала")
    public void openTelegramchanell() {
        loginPage.openPage(url)
                .login(UserFactory.withAdminPermision())
                .pressSubmit();
        homePage.waitPageLoading();
        telegramPage.openTelegram()
                .cancelTelegram();
    }
}
