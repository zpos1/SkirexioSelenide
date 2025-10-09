package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SmartTerminalPage {
    public final SelenideElement smartTerminalPage = $x("//*[contains(text(), 'Биржевой аккаунт')]");
    public final SelenideElement tradingPair = $("[aria-label='Select Торговая пара']");
    public final SelenideElement chosePair = $("[placeholder='Выберите торговую пару']");
    public final String a ="AsterUSDT";

    public SmartTerminalPage SmartTerminalPageExist() {
        smartTerminalPage.shouldBe(visible);
        return this;
    }

    @Step("Открытие списка Trading Pair")
    public SmartTerminalPage pushTradingPair() {
        tradingPair.click();
        return this;
    }

    @Step("Выбор пары AsterUSDT")
    public SmartTerminalPage chooseAsterUSDT() {
        chosePair.val("aster").pressEnter();
        tradingPair.shouldHave(text("ASTER"));
        return this;
    }

    public SmartTerminalPage waitPageLoading() {
        smartTerminalPage.shouldBe(Condition.visible);
        return this;
    }
}
