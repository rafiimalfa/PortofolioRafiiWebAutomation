package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import org.example.pageobject.LandingPage;
import org.junit.Assert;

public class HeroSectionSteps {
    LandingPage landingPage = new LandingPage(Hooks.driver);

    @Given("User already on rafiimalfa.com portofolio page")
    public void userAlreadyOnRafiimalfaComPortofolioPage() {
        landingPage.verifyHeadingIsDisplayed();
    }

    @Given("Verify {string} copywriting on hero section correct as per document")
    public void verifyCopywritingOnHeroSectionCorrectAsPerDocument(String title) {
        String getTitle = landingPage.verifyHeadingSectionHero();
        Assert.assertEquals(getTitle,title);
    }

    @Given("Verify my profile image capsule appear properly")
    public void verifyMyProfileImageCapsuleAppearProperly() {
        landingPage.verifyMyProfilePicture();
    }

    @Given("Verify description {string}")
    public void verifyDescription(String description) {
        String getDescription = landingPage.verifyDescriptionSectionHero();
        Assert.assertEquals(getDescription,description);
    }
}
