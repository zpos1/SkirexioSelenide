package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BaseTest {
    private final SelenideElement homePage = $("[class='lucide lucide-house']");
    private final SelenideElement terminalButton = $x(("//button[text()='Терминал']"));
    private final SelenideElement smartTerminalButtom = $("[ href='/manual-trading/trading-terminal']");

    public HomePage() {
        super();
    }

    public HomePage waitPageLoading() {
        homePage.shouldBe(Condition.visible);
        return this;
    }

    @Step("Нажатие на кнопку Терминал")
    public HomePage pressTerminalButton() {
        terminalButton.pressEnter();
        return this;
    }

    @Step("Нажатие на кнопку Смарт терминал")
    public HomePage pressSmartTerminalButton() {
        smartTerminalButtom.doubleClick();
        return this;
    }
}
