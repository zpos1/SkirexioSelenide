package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SmartTerminalPage {
    public final SelenideElement smartTerminalPage = $x("//*[contains(text(), 'Биржевой аккаунт')]");
    public final SelenideElement tradingPair = $("[class='tw-text-[#2ECD99]']");
    public final SelenideElement chosePair = $("[placeholder='Выберите торговую пару']");

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
        chosePair.val("aster");
        return this;
    }

    public SmartTerminalPage waitPageLoading() {
        smartTerminalPage.shouldBe(Condition.visible);
        return this;
    }
}
