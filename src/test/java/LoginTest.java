import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {
    @Test
    public void projectLogin(){
        open("login");
        $("[placeholder='Email']").setValue("banya@mail.ru");
        $("[placeholder='Пароль']").setValue("123456!@#");
        $("[type='submit']").pressEnter();
        $("[class='lucide lucide-house']").should();
    }
}
