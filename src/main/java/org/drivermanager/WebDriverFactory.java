package org.drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {

    private WebDriverFactory() {
    }

    public static WebDriver getDriver(String browserName) {
        switch (browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                return new ChromeDriver();
            case "edge":
                System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver");
                return new EdgeDriver();
            default:
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_mac_arm64/chromedriver");
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                return new ChromeDriver();
        }
    }
}
