package org.headerTests;

import org.flows.commonflow.HeaderActionMenuFlow;
import org.pages.fragments.HeaderActionMenu;
import org.setup.Setup;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.utils.PopHelpers.closeCountryPopUpButton;


public class ActionMenuTest extends Setup {

    private HeaderActionMenuFlow headerActionMenuFlow;

    private HeaderActionMenu headerActionMenu;

    private String LINK = "https://www.ray-ban.com/usa/prescription-and-lenses";

    @BeforeMethod
    public void navigateHomepage() {
        headerActionMenuFlow = new HeaderActionMenuFlow(driver);
        headerActionMenu = new HeaderActionMenu(driver);
        driver.get(LINK);
        driver.manage().window().maximize();
        closeCountryPopUpButton(driver);
    }

    @Test
    public void testOpenSearchField() {
        headerActionMenuFlow.openSearchField();
        assertTrue(headerActionMenu
                .getSearchPanel()
                .isDisplayed(), "Search field is not displayed");
    }

    @Test
    public void testShowAccountSubmenu() {
        headerActionMenuFlow.openSidebarMyAccount();
        assertTrue(headerActionMenu
                .getMyAccountSidePanel()
                .isDisplayed(), "My account side panel is not displayed");
    }

    @Test
    public void testOpenMyCard() {
        headerActionMenuFlow.navigateToMyCart();
        String expectedTitle = "Shopping Cart | USA";
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle, "Page title is not as expected");
    }
}
