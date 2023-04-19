package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import myapp.drivermanager.WebDriverCash;
import org.openqa.selenium.WebDriver;

public class AbstractSetupDefs {

    public static WebDriver driver;

    @Before
    public void initialization() {
        driver = WebDriverCash.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
