package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SmartTerminalPage {
    public final SelenideElement smartTerminalPage = $(By.xpath("//*[@id='root']/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div/span"));

    public void SmartTerminalPageExist() {
        smartTerminalPage.shouldBe(visible);
    }
}
