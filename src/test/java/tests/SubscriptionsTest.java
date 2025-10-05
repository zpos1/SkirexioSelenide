package tests;

import org.testng.annotations.Test;
import user.UserFactory;

public class SubscriptionsTest extends BaseTest {

    @Test
    public void openSubscriptions() {
        loginpage.openPage();
        loginpage.login(UserFactory.withAdminPermision());
        loginpage.pressSubmit();
        homePage.waitPageLoading();
        subscriptionsPage.subOpen();
    }

}
