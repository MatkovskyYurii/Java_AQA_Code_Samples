package org.flows.commonflow;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pages.fragments.NavigationMenu;

public class NavigationMenuFlow {

    private NavigationMenu navigationMenu;

    private Actions actions;

    public NavigationMenuFlow(WebDriver driver) {
        navigationMenu = new NavigationMenu(driver);
        actions = new Actions(driver);
    }

    public void showSunglassesSubmenu() {
        actions.moveToElement(navigationMenu.getSunglassesButton()).perform();
    }

    public void showEyeglassesSubmenu() {
        actions.moveToElement(navigationMenu.getEyeglassesButton()).perform();
    }

    public boolean isSubmenuDisplayed(String buttonId) {
        return navigationMenu.getSubmenu().isDisplayed();
    }

    public void navigateToAllSunglasses() {
        showSunglassesSubmenu();
        navigationMenu.getSunglassesViewAllButton().click();
    }

    public void navigateToAllEyeglasses() {
        showEyeglassesSubmenu();
        navigationMenu.getEyeglassesViewAllButton().click();
    }

    public void clickOnSubmenu(String buttonId) {
        WebElement submenu = navigationMenu.getButtonById(buttonId);
        actions.moveToElement(submenu).perform();
    }
}