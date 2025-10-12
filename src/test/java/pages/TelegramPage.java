package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class TelegramPage {
    private final SelenideElement viewTelegramPage = $("[href='https://t.me/skyrexio']");

    @Step("Переход в телеграм канал")
    public TelegramPage openTelegram() {
        viewTelegramPage.pressEnter();
        return this;
    }

    @Step("Нажатие Cancel")
    public TelegramPage cancelTelegram() {
        switchTo().window(1);
        return this;
    }
}
