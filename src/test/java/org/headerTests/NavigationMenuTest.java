package org.headerTests;

import org.flows.commonflow.NavigationMenuFlow;
import org.pages.fragments.NavigationMenu;
import org.setup.Setup;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.utils.PopHelpers.closeCountryPopUpButton;

public class NavigationMenuTest extends Setup {

    private NavigationMenuFlow navigationMenuFlow;

    private NavigationMenu navigationMenu;

    private String LINK = "https://www.ray-ban.com/usa/prescription-and-lenses";

    @BeforeMethod
    public void navigateHomepage() {
        navigationMenuFlow = new NavigationMenuFlow(driver);
        navigationMenu = new NavigationMenu(driver);
        driver.get(LINK);
        driver.manage().window().maximize();
        closeCountryPopUpButton(driver);
    }

    @Test
    public void verifySubmenuIsDisplayedAfterClick() {
        String[] buttonsId = {"46588", "48212", "37370", "45888", "433474"};
        for (String buttonId : buttonsId) {
            navigationMenuFlow.clickOnSubmenu(buttonId);
            assertTrue(navigationMenuFlow.isSubmenuDisplayed(buttonId),
                    "The submenu for button with ID " + buttonId + " is not displayed after click.");
        }
    }

    @Test
    public void testNavigateToSunglassesAll() {
        navigationMenuFlow.navigateToAllSunglasses();
        String expectedTitle = "Sunglasses for Men and Women | Ray-Ban® USA";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle, "Page title is not as expected");
    }

    @Test
    public void testNavigateToEyeglassesAll() {
        navigationMenuFlow.navigateToAllEyeglasses();
        String expected = "All Eyeglasses and Frames | Ray-Ban® USA";
        String actualTitle = driver.getTitle();
        assertEquals(expected, actualTitle, "Page title is not as expected");
    }
}

