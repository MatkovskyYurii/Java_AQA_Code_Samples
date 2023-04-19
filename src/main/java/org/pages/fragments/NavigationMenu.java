package org.pages.fragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationMenu extends AbstractPage {

    @FindBy(xpath = "//div/button[@data-menu-id='46588']")
    private WebElement sunglassesButton;

    @FindBy(xpath = "//div/button[@data-menu-id='48212']")
    private WebElement eyeglassesButton;

    @FindBy(xpath = "//div/button[@data-menu-id='37370']")
    private WebElement customizeButton;

    @FindBy(xpath = "//div/button[@data-menu-id='45888']")
    private WebElement prescriptionButton;

    @FindBy(xpath = "//div/button[@data-menu-id='433474']")
    private WebElement promoButton;

    @FindBy(xpath = "//div[@class='submenu__items']")
    private WebElement submenuItems;

    @FindBy(xpath = "//a[@data-description='SunglassesViewAll']")
    private WebElement sunglassesViewAllButton;

    @FindBy(xpath = "//a[@data-description='EyeglassesViewAll']")
    private WebElement eyeglassesViewAllButton;

    public NavigationMenu(WebDriver driver) {
        super(driver);
    }

    public WebElement getSunglassesButton() {
        return sunglassesButton;
    }

    public WebElement getEyeglassesButton() {
        return eyeglassesButton;
    }

    public WebElement getCustomizeButton() {
        return customizeButton;
    }

    public WebElement getPrescriptionButton() {
        return prescriptionButton;
    }

    public WebElement getPromoButton() {
        return promoButton;
    }

    public WebElement getSubmenu() {
        return submenuItems;
    }

    public WebElement getSunglassesViewAllButton() {
        return sunglassesViewAllButton;
    }

    public WebElement getEyeglassesViewAllButton() {
        return eyeglassesViewAllButton;
    }

    public WebElement getButtonById(String buttonId) {
        return driver.findElement(By.xpath("//div/button[@data-menu-id='" + buttonId + "']"));
    }
}