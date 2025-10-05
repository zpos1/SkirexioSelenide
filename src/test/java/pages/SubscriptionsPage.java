package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$;

public class SubscriptionsPage {
    private final SelenideElement openSubscriptionPage = $(
            "[href='/subscriptions']");
    private final SelenideElement subscriptionsCurrentPlan = $("[class='tw-text-sm tw-text-muted-foreground']");

    @Step("Переход на страницу Subscriptions")
    public void subOpen() {
        openSubscriptionPage.pressEnter();
        subscriptionsCurrentPlan.shouldBe();
    }
}
