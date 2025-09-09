package org.example.pageobject;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage {

    private final By heading = By.tagName("h1");
    private final By scrollButton = By.xpath("//button[@class=' group absolute z-30 bottom-6 left-1/2 -translate-x-1/2 md:bottom-2 md:right-0 md:left-auto md:translate-x-0 h-14 w-14 md:h-20 md:w-20 rounded-full border shadow-sm bg-white/90 hover:bg-white transition flex items-center justify-center ']");
    private final By headingAboutSection = By.xpath("//p[@class='jsx-1c477d8d2de5cf74  font-montserrat text-base md:text-lg leading-7 md:leading-8 text-white/85 ml-[8%] md:ml-[12%]  absolute inset-0']");
    private final By headingMyProjectSection = By.xpath("//div[@class='font-montserrat font-light tracking-[0.18em] text-[22vw] md:text-[168px] uppercase']");
//    private final By headingHeroSection = By.xpath("//h1[@class='text-[14vw] leading-[0.9] font-regular tracking-tight md:text-[150px] text-black']");
    private final By myProfilePictureCapsule = By.xpath("//img[@alt='Rafii Profile']");
    private final By descriptionHeroSection = By.xpath("//span[@class='font-semibold']");

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyHeadingIsDisplayed(){
        WebElement h = driver.findElement(heading);
        return isDisplayed(h);
    }
    public void verifyScrollButtonIsClickable() throws InterruptedException {
        WebElement btn = driver.findElement(scrollButton);
        Thread.sleep(2000);
        waitForElementVisible(btn);
        click(btn);
    }
    public boolean verifyHeadingAboutSectionIsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        WebElement headingAbout = driver.findElement(headingAboutSection);
        return isDisplayed(headingAbout);
    }
    public boolean verifyHeadingMyProjectSectionIsDisplayed() throws InterruptedException {
        WebElement headingMyProject = driver.findElement(headingMyProjectSection);
        scrollIntoView(headingMyProject);
        Thread.sleep(2000);
        return isDisplayed(headingMyProject);
    }
    public String verifyHeadingSectionHero(){
        WebElement headingHero = driver.findElement(heading);
        return headingHero.getText();
    }

    public boolean verifyMyProfilePicture(){
        WebElement profilePictureCapsule = driver.findElement(myProfilePictureCapsule);
        return isDisplayed(profilePictureCapsule);
    }
    public String verifyDescriptionSectionHero(){
        WebElement descriptionHero = driver.findElement(descriptionHeroSection);
        return descriptionHero.getText();
    }
}
