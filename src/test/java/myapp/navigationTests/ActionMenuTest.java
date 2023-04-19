package myapp.navigationTests;

import myapp.flows.commonflow.HeaderActionMenuFlow;
import myapp.pages.fragments.HeaderActionMenu;
import myapp.setup.Setup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static myapp.utils.PopHelpers.closeCountryPopUpButton;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ActionMenuTest extends Setup {

    private static HeaderActionMenuFlow headerActionMenuFlow = new HeaderActionMenuFlow(driver);

    private static HeaderActionMenu headerActionMenu = new HeaderActionMenu(driver);

    private String LINK = "https://www.ray-ban.com/usa/prescription-and-lenses";

    @BeforeEach
    public void navigateHomepage() {
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
