package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BaseTest {
    private final SelenideElement homePage = $("[class='lucide lucide-house']");

    public HomePage() {
        super();
    }

    public void waitPageLoading() {
        homePage.shouldBe(Condition.visible);
    }
}
