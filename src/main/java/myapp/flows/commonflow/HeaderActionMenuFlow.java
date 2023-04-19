package myapp.flows.commonflow;

import myapp.pages.fragments.HeaderActionMenu;
import org.openqa.selenium.WebDriver;

public class HeaderActionMenuFlow {

    private HeaderActionMenu headerActionMenu;


    public HeaderActionMenuFlow(WebDriver driver) {
        headerActionMenu = new HeaderActionMenu(driver);
    }

    public void openSearchField() {
        headerActionMenu.getSearchField().click();
    }

    public void openSidebarMyAccount() {
        headerActionMenu.getMyAccountButton().click();
    }

    public void navigateToMyCart() {
        headerActionMenu.getMyCartButton().click();
    }
}
