package myapp.flows;


import myapp.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow {

    private LoginPage loginPage;

    public LoginFlow(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
    }

    public void setLogin(String login) {
        loginPage.getLoginField().click();
        loginPage.getLoginField().sendKeys(login);
    }

    public void setPassword(String password) {
        loginPage.getPasswordField().click();
        loginPage.getPasswordField().sendKeys(password);
    }

    public void submit() {
        loginPage.getLoginButton().click();
    }
}
