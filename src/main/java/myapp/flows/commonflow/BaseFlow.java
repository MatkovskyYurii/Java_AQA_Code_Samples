package myapp.flows.commonflow;


import org.openqa.selenium.WebDriver;

public abstract class BaseFlow {

    private HeaderActionMenuFlow headerActionMenuFlow;

    private NavigationMenuFlow navigationMenuFlow;

    public BaseFlow(WebDriver driver) {
        headerActionMenuFlow = new HeaderActionMenuFlow(driver);
        navigationMenuFlow = new NavigationMenuFlow(driver);
    }

    public HeaderActionMenuFlow getHeaderActionMenuFlow() {
        return headerActionMenuFlow;
    }

    public NavigationMenuFlow getNavigationMenuFlow() {
        return navigationMenuFlow;
    }
}
