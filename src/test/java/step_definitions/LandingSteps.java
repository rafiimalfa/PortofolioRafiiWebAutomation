package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pageobject.LandingPage;
import org.junit.Assert;

public class LandingSteps {
    LandingPage landingPage = new LandingPage(Hooks.driver);

    @Given("User opens home page")
    public void user_opens_home_page() {
        // already opened in Hooks @Before
    }

    @Then("Heading should be visible")
    public void heading_should_be_visible() {
        Assert.assertTrue("Heading should be visible", landingPage.verifyHeadingIsDisplayed());
    }

    @And("Click scroll down button")
    public void clickScrollDownButton() throws InterruptedException {

        landingPage.verifyScrollButtonIsClickable();
    }

    @And("Verify heading about section is visible")
    public void verifyHeadingAboutSectionIsVisible() throws InterruptedException {
        Assert.assertTrue(landingPage.verifyHeadingAboutSectionIsDisplayed());
    }

    @Then("Verify scroll until my project section heading is visible")
    public void verifyScrollUntilMyProjectSectionHedingIsVisible() throws InterruptedException {
        Assert.assertTrue(landingPage.verifyHeadingMyProjectSectionIsDisplayed());
    }
}
