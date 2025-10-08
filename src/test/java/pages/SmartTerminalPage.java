package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SmartTerminalPage {
    public final SelenideElement smartTerminalPage = $x("//*[contains(text(), 'Биржевой аккаунт')]");

    public void SmartTerminalPageExist() {
        smartTerminalPage.shouldBe(visible);
    }
}
