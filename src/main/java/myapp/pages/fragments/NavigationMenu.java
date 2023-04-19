package myapp.pages.fragments;

import myapp.utils.WaitersManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NavigationMenu extends AbstractPage {

    private static final By SUNGLASSES_BUTTON = By.xpath("//div/button[@data-menu-id='46588']");

    private static final By EYEGLASSES_BUTTON = By.xpath("//div/button[@data-menu-id='48212']");

    private static final By CUSTOMIZE_BUTTON = By.xpath("//div/button[@data-menu-id='37370']");

    private static final By PRESCRIPTION_BUTTON = By.xpath("//div/button[@data-menu-id='45888']");

    private static final By PROMO_BUTTON = By.xpath("//div/button[@data-menu-id='433474']");

    private static final By SUBMENU_ITEMS =
            By.xpath("//*[@id=\"rb-header\"]/div[3]");


    private static final By SUNGLASSES_VIEW_ALL_BUTTON =
            By.xpath("//a[@data-description='SunglassesViewAll']");

    private static final By EYEGLASSES_VIEW_ALL_BUTTON =
            By.xpath("//a[@data-description='EyeglassesViewAll']");

    public NavigationMenu(WebDriver driver) {
        super(driver);
    }

    public WebElement getSunglassesButton() {
        return WaitersManager.waitUntilElementIsClickableFluent(driver, SUNGLASSES_BUTTON);
    }

    public WebElement getEyeglassesButton() {
        return WaitersManager.waitUntilElementIsClickableFluent(driver, EYEGLASSES_BUTTON);
    }

    public WebElement getCustomizeButton() {
        return WaitersManager.waitUntilElementIsClickable(driver, CUSTOMIZE_BUTTON);
    }

    public WebElement getPrescriptionButton() {
        return WaitersManager.waitUntilElementIsClickable(driver, PRESCRIPTION_BUTTON);
    }

    public WebElement getPromoButton() {
        return WaitersManager.waitUntilElementIsClickable(driver, PROMO_BUTTON);
    }

    public WebElement getSubmenu() {
        return WaitersManager.waitUntilElementIsVisible(driver, SUBMENU_ITEMS);
    }

    public WebElement getSunglassesViewAllButton() {
        return WaitersManager.waitUntilElementIsClickable(driver, SUNGLASSES_VIEW_ALL_BUTTON);
    }

    public WebElement getEyeglassesViewAllButton() {
        return WaitersManager.waitUntilElementIsClickable(driver, EYEGLASSES_VIEW_ALL_BUTTON);
    }

    public WebElement getButtonById(String buttonId) {
        return driver.findElement(By.xpath("//div/button[@data-menu-id='" + buttonId + "']"));
    }
}
