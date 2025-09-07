package org.example.pageobject;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage {

    private final By heading = By.tagName("h1");
    private final By scrollButton = By.xpath("//span[@class='block text-4xl leading-none -translate-y-[1px] group-hover:translate-y-[1px] transition']");
    private final By headingAboutSection = By.xpath("//p[@class='jsx-1c477d8d2de5cf74  font-montserrat text-base md:text-lg leading-7 md:leading-8 text-white/85 ml-[8%] md:ml-[12%]  absolute inset-0']");
    private final By headingMyProjectSection = By.xpath("//div[@class='font-montserrat font-light tracking-[0.18em] text-[22vw] md:text-[168px] uppercase']");

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
}
