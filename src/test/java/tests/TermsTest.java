package tests;

import org.testng.annotations.Test;

public class TermsTest extends BaseTest {
    @Test
    public void openTermsPage2() {
        termsPage.openTermsPage(terms);
        termsPage.viewTerms();
    }
}
