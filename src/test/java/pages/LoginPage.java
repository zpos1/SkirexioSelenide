package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import user.User;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private final String USER_CSS = "[placeholder='Email']";
    private final SelenideElement passwordEnter = $("[placeholder='Пароль']");
    private final SelenideElement submit = $("[type='submit']");
    private final SelenideElement error = $("[class='lucide lucide-circle-alert tw-cursor-pointer tw-text-red-500']");

    @Step(value = "Открытие браузера")
    public LoginPage openPage(String url) {
        open(url);
        return this;
    }

    @Step(value = "Ввод логина и пароля")
    public LoginPage login(User user) {
        $(USER_CSS).setValue(user.getEmail());
        passwordEnter.setValue(user.getPassword());
        return this;
    }

    @Step(value = "Нажатие Войти")
    public LoginPage pressSubmit() {
        submit.pressEnter();
        return this;
    }

    @Step("Отображение ошибки")
    public void errorVisible(){ error.shouldBe(Condition.visible);}
}
