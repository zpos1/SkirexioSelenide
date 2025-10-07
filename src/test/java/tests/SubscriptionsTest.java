package tests;

import org.testng.annotations.Test;
import user.UserFactory;

public class SubscriptionsTest extends BaseTest {

    @Test
    public void openSubscriptions() {
        loginPage.openPage(url);
        loginPage.login(UserFactory.withAdminPermision());
        loginPage.pressSubmit();
        homePage.waitPageLoading();
        subscriptionsPage.subOpen();
    }
}
