package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BaseTest {
    private final SelenideElement homePage = $("[class='lucide lucide-house']");
    private final SelenideElement terminalButton = $("[class='tw-group tw-inline-flex tw-h-10 tw-w-max tw-items-center tw-justify-center tw-rounded-md tw-bg-background tw-px-4 tw-py-2 tw-text-sm tw-font-medium tw-transition-colors lg:hover:tw-bg-accent lg:hover:tw-text-accent-foreground disabled:tw-pointer-events-none disabled:tw-opacity-50 data-[state=open]:tw-text-accent-foreground data-[state=open]:tw-bg-accent/50 data-[state=open]:hover:tw-bg-accent data-[state=open]:focus:tw-bg-accent data-[match=true]:tw-bg-accent data-[match=true]:tw-text-accent-foreground tw-group tw-text-lg tw-font-normal tw-flex tw-items-center tw-gap-2']");
    private final SelenideElement smartTerminalButtom = $("[class='tw-line-clamp-2 tw-text-sm tw-leading-snug tw-text-muted-foreground tw-m-0']");

    public HomePage() {
        super();
    }

    public HomePage waitPageLoading() {
        homePage.shouldBe(Condition.visible);
        return this;
    }

    @Step("Нажатие на кнопку Терминал")
    public HomePage pressTerminalButton() {
        terminalButton.pressEnter();
        return this;
    }

    @Step("Нажатие на кнопку Смарт терминал")
    public HomePage pressSmartTerminalButton() {
        smartTerminalButtom.doubleClick();
        return this;
    }
}
