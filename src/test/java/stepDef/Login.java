package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Login {

    LoginPage loginPage;

    public Login() {
        this.loginPage = new LoginPage();
    }

    @Given("user on login page of Melaka")
    public void userOnLoginPageOfMelaka() {
        loginPage.userOnLoginPageOfMelaka();

    }

    @When("input email {string}")
    public void inputEmail(String Email) {
        loginPage.inputEmail(Email);
    }

    @And("input password {string}")
    public void inputPassword(String Password) {
        loginPage.inputPassword(Password);
    }

    @And("click loggin button")
    public void clickLogginButton() {
        loginPage.clickLogginButton();
    }

    @Then("user get red alert {string}")
    public void userGetRedAlert(String RedAlert) {
        loginPage.userGetRedAlert(RedAlert);
    }

    @Then("user on homepage dashnoard")
    public void userOnHomepageDashnoard() {
        loginPage.userOnHomepageDashnoard();
    }

    @Then("user get red alertt {string}")
    public void userGetRedAlertt(String Redalert) {
        loginPage.userGetRedAlertt(Redalert);
    }

    @Then("user get red alerttt {string}")
    public void userGetRedAlerttt(String redalerttt) {
        loginPage.userGetRedAlerttt(redalerttt);
    }
}
