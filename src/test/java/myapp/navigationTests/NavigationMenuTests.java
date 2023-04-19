package myapp.navigationTests;


import myapp.flows.commonflow.NavigationMenuFlow;
import myapp.setup.Setup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static myapp.utils.PopHelpers.closeCountryPopUpButton;
import static org.junit.jupiter.api.Assertions.*;

public class NavigationMenuTests extends Setup {
    private static NavigationMenuFlow navigationMenuFlow = new NavigationMenuFlow(driver);

    private static String LINK = "https://www.ray-ban.com/usa/prescription-and-lenses";

    @BeforeEach
    public void navigateHomepage() {
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
