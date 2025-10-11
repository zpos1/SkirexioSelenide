package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SubscriptionsPage {
    private final SelenideElement openSubscriptionPage = $("[href='/subscriptions']");
    private final SelenideElement subscriptionsCurrentPlan = $x("//*[contains(text(), 'Бессрочный доступ') or contains(text(), 'Lifetime access')]");

    @Step("Переход на страницу Subscriptions")
    public void subOpen() {
        openSubscriptionPage.pressEnter();
        subscriptionsCurrentPlan.shouldBe(visible);
    }
}
