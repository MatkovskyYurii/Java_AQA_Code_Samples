package myapp.setup;

import myapp.drivermanager.WebDriverCash;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Setup {
    protected static WebDriver driver;

    private static final int WAIT = 3000;

    @BeforeAll
    public static void init() {
        driver = WebDriverCash.getDriver("edge");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(WAIT));
    }

    @AfterAll
    public static void quitDriver() {
        driver.quit();
    }
}

