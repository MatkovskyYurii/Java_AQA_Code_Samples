package myapp.pages.fragments;

import myapp.utils.WaitersManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderActionMenu extends AbstractPage {

    private static final By SEARCH_FIELD_BUTTON =
            By.xpath("//button/span[@class='common__icon common__icon--search']");
    private static final By MY_ACCOUNT_BUTTON =
            By.xpath("//button//span[@class='common__icon common__icon--account']");

    private static final By MY_CART_BUTTON = By.xpath("//button[@class='action action--bag']");

    private static final By SEARCH_PANEL = By.xpath("//*[@id='rb-header-app']/header/div[1]");

    private static final By MY_ACCOUNT_SIDE_PANEL = By.xpath("//div[contains(@class, " +
            "'rb-header__side-panel') " +
            "and contains(@class, 'rb-header-account-side-panel') " +
            "and contains(@class, 'rb-header__side-panel--visible')]\n");

    public HeaderActionMenu(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return WaitersManager.waitUntilElementIsClickable(driver, SEARCH_FIELD_BUTTON);
    }

    public WebElement getMyAccountButton() {
        return WaitersManager.waitUntilElementIsClickable(driver, MY_ACCOUNT_BUTTON);
    }

    public WebElement getMyCartButton() {
        return WaitersManager.waitUntilElementIsClickable(driver, MY_CART_BUTTON);
    }

    public WebElement getSearchPanel() {
        return WaitersManager.waitUntilElementIsVisible(driver, SEARCH_PANEL);
    }

    public WebElement getMyAccountSidePanel() {
        return WaitersManager.waitUntilElementIsVisible(driver, MY_ACCOUNT_SIDE_PANEL);
    }
}
