package pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import user.User;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private final String USER_CSS = "[placeholder='Email']";
    private final SelenideElement passwordEnter = $("[placeholder='Пароль']");
    private final SelenideElement submit = $("[type='submit']");

    @Test
    public void openPage() {
        open("login");
    }

    public void login(User user) {
        $(USER_CSS).setValue(user.getEmail());
        passwordEnter.setValue(user.getPassword());
        submit.pressEnter();
    }
}
