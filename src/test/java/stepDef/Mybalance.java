package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MybalencePage;
import pages.pageHomepage;

public class Mybalance {

    MybalencePage mybalencePage;

    public Mybalance() {
        this.mybalencePage = new MybalencePage();
    }

    @Given("user on login page of Melaka#")
    public void userOnLoginPageOfMelaka() {
        mybalencePage.userOnLoginPageOfMelaka();
    }

    @When("input email# {string}")
    public void inputEmail(String Email) {
        mybalencePage.inputEmail(Email);
    }

    @And("input password# {string}")
    public void inputPassword(String Password) {
        mybalencePage.inputPassword(Password);
    }

    @And("click loggin button#")
    public void clickLogginButton() {
        mybalencePage.clickLogginButton();
    }

    @And("user on homepage dashboard#")
    public void userOnHomepageDashboard() {
        mybalencePage.userOnHomepageDashboard();
    }

    @And("user click tab My Balance")
    public void userClickTabMyBalance() {
        mybalencePage.userClickTabMyBalance();
    }

    @Then("user get information about My Balance")
    public void userGetInformationAboutMyBalance() {
        mybalencePage.userGetInformationAboutMyBalance();
    }

    @And("User set start from and end date")
    public void userSetStartFromAndEndDate(int day, int month, int year) {
        mybalencePage.userSetStartFromAndEndDate(day, month, year);
    }

    @And("user click applied")
    public void userClickApplied() {
        mybalencePage.userClickApplied();
    }

    @And("user get information History of My Balance")
    public void userGetInformationHistoryOfMyBalance() {
        mybalencePage.userGetInformationHistoryOfMyBalance();
    }
}
