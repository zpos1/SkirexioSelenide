package tests;

import org.testng.annotations.Test;
import user.UserFactory;

public class SubscriptionsTest extends BaseTest {

    @Test
    public void openSubscriptions() {
        loginPage.openPage(url)
                .login(UserFactory.withAdminPermision())
                .pressSubmit();
        homePage.waitPageLoading();
        subscriptionsPage.subOpen();
    }
}
