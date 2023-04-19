package myapp.pages;

import myapp.pages.fragments.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

    private final static By loginField = By.xpath("//input[@id='loginEmail']");
    private final static By passwordField = By.xpath("//input[@id='wcs_logon_password']");
    private final static By loginButton = By.xpath("//input[@id='login_submit']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginField() {
        return driver.findElement(loginField);
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }
}
