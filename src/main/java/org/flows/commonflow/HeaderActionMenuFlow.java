package org.flows.commonflow;

import org.openqa.selenium.WebDriver;
import org.pages.fragments.HeaderActionMenu;

public class HeaderActionMenuFlow {

    private HeaderActionMenu headerActionMenu;

    public HeaderActionMenuFlow(WebDriver driver) {
        this.headerActionMenu = new HeaderActionMenu(driver);
    }

    public void openSearchField() {
        headerActionMenu.getSearchFieldButton().click();
    }

    public void openSidebarMyAccount() {
        headerActionMenu.getMyAccountButton().click();
    }

    public void navigateToMyCart() {
        headerActionMenu.getMyCartButton().click();
    }
}
