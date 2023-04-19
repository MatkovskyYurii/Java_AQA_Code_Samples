package org.pages.fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.utils.WaitersManager;

public class HeaderActionMenu extends AbstractPage {

    @FindBy(xpath = "//button/span[@class='common__icon common__icon--search']")
    private WebElement searchFieldButton;

    @FindBy(xpath = "//button//span[@class='common__icon common__icon--account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//button[@class='action action--bag']")
    private WebElement myCartButton;

    @FindBy(xpath = "//*[@id='rb-header-app']/header/div[1]")
    private WebElement searchPanel;

    @FindBy(xpath = "//div[contains(@class, 'rb-header__side-panel') " +
            "and contains(@class, 'rb-header-account-side-panel') " +
            "and contains(@class, 'rb-header__side-panel--visible')]\n")
    private WebElement myAccountSidePanel;

    public HeaderActionMenu(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchFieldButton() {
        return WaitersManager.waitUntilElementIsClickable(driver, searchFieldButton);
    }

    public WebElement getMyAccountButton() {
        return WaitersManager.waitUntilElementIsClickableFluent(driver, myAccountButton);
    }

    public WebElement getMyCartButton() {
        return WaitersManager.waitUntilElementIsClickable(driver, myCartButton);
    }

    public WebElement getSearchPanel() {
        return WaitersManager.waitUntilElementIsVisible(driver, searchPanel);
    }

    public WebElement getMyAccountSidePanel() {
        return WaitersManager.waitUntilElementIsVisible(driver, myAccountSidePanel);
    }
}
