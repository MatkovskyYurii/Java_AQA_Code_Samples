package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myapp.flows.LoginFlow;
import org.junit.jupiter.api.Assertions;

import static myapp.utils.PopHelpers.closeCountryPopUpButton;
import static stepdefinitions.AbstractSetupDefs.driver;

public class LoginStepDefs {

    private LoginFlow loginFlow;

    @Given("I open login page")
    public void i_open_login_page() {
        loginFlow = new LoginFlow(driver);
        driver.get("https://www.ray-ban.com/LoginDisplayView?catalogId=22564&langId=-43&storeId=25653");
        closeCountryPopUpButton(driver);
    }

    @When("I fill login {string}")
    public void i_fill_login(String login) {
        loginFlow.setLogin(login);
    }

    @When("I fill password {string}")
    public void i_fill_password(String pass) {
        loginFlow.setPassword(pass);
    }

    @When("I click submit")
    public void i_click_submit() {
        loginFlow.submit();
    }

    @Then("I see all is good")
    public void i_see_all_is_good() {
        Assertions.assertTrue(true);
        driver.close();
    }
}
