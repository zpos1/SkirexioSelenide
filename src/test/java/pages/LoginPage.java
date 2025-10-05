package pages;

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

    @Step(value = "Открытие браузера")
    public void openPage() {
        open("login");
    }

    @Step(value = "Ввод логина и пароля")
    public void login(User user) {
        $(USER_CSS).setValue(user.getEmail());
        passwordEnter.setValue(user.getPassword());
    }

    @Step(value = "Нажатие Войти")
    public void pressSubmit() {
        submit.pressEnter();
    }
}
