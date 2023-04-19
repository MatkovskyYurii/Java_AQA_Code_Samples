package org.flows.commonflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseFlow {

    private HeaderActionMenuFlow headerActionMenuFlow;

    private NavigationMenuFlow navigationMenuFlow;

    public BaseFlow(WebDriver driver) {
        headerActionMenuFlow = PageFactory.initElements(driver, HeaderActionMenuFlow.class);
        navigationMenuFlow = PageFactory.initElements(driver, NavigationMenuFlow.class);
    }

    public HeaderActionMenuFlow getHeaderActionMenuFlow() {
        return headerActionMenuFlow;
    }

    public NavigationMenuFlow getNavigationMenuFlow() {
        return navigationMenuFlow;
    }
}