package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tests.BaseTest;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TermsPage extends BaseTest {
    private static final SelenideElement viewTermsPage = $(
            "[class='elementor-heading-title elementor-size-default']");

    @Step("Переход на страницу Terms")
    public void openTermsPage(String terms) {
        open(terms);
    }

    @Step("Проверка отображения страницы Terms")
    public static void viewTerms() {
        viewTermsPage.shouldBe(Condition.visible);
    }
}
