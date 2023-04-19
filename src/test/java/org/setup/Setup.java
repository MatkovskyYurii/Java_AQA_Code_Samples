package org.setup;

import org.drivermanager.WebDriverCash;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.time.Duration;

public class Setup {
    protected WebDriver driver;

    private final int WAIT = 3000;

    @BeforeClass
    public void init() {
        driver = WebDriverCash.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(WAIT));
    }

    @AfterClass
    public void quitDriver() {
        driver.quit();
    }
}

