package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class TelegramPage {
    private final SelenideElement viewTelegramPage = $("[href='https://t.me/skyrexio']");

    @Step("Переход в телеграм канал")
    public void openTelegram() {
        viewTelegramPage.pressEnter();
    }

    @Step("Нажатие Cancel")
    public void cancelTelegram() {
        switchTo().window(1);
    }
}
