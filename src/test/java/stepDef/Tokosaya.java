package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TokoSayaPage;

public class Tokosaya {

    TokoSayaPage tokoSaya;

    public Tokosaya() {
        this.tokoSaya = new TokoSayaPage();
    }


    @Given("user on login page of Melaka+")
    public void userOnLoginPageOfMelaka() {
        tokoSaya.userOnLoginPageOfMelaka();

    }

    @When("input email+ {string}")
    public void inputEmail(String Email) {
        tokoSaya.inputEmail(Email);

    }

    @And("input password+ {string}")
    public void inputPassword(String Password) {
        tokoSaya.inputPassword(Password);
    }

    @And("click loggin button+")
    public void clickLogginButton() {
        tokoSaya.clickLogginButton();

    }

    @And("user on homepage dashboard+")
    public void userOnHomepageDashboard() {
        tokoSaya.userOnHomepageDashboard();

    }

    @And("click tab store")
    public void clickTabStore() {
        tokoSaya.clickTabStore();
    }
//Red ALert
    @And("click Tim sales")
    public void clickTimSales() {
        tokoSaya.clickTimSales();
    }

    @And("click add sales")
    public void clickAddSales() {
        tokoSaya.clickAddSales();
    }

    @And("input Name {string}")
    public void inputName(String Nama) {
        tokoSaya.inputName(Nama);
    }

    @And("input {string}")
    public void input(String input) {
        tokoSaya.input(input);
    }

    @And("input email salese {string}")
    public void inputEmailSalese(String Emaill) {
        tokoSaya.inputEmailSalese(Emaill);
    }

    @Then("user can see red alert {string}")
    public void userCanSeeRedAlert(String Alert) {
//        tokoSaya.userCanSeeRedAlert(Alert);
    }

    @And("click save button")
    public void clickSaveButton() {
        tokoSaya.clickSaveButton();
    }


    @Then("User get update information on page")
    public void userGetUpdateInformationOnPage() {
        tokoSaya.userGetUpdateInformationOnPage();
    }

//Delete Account

    @And("user click icon trash")
    public void userClickIconTrash() {
        tokoSaya.userClickIconTrash();
    }

    @And("user see pop up, sure delete account sales")
    public void userSeePopUpSureDeleteAccountSales() {
        tokoSaya.userSeePopUpSureDeleteAccountSales();
    }

    @Then("user click button yes click account sales")
    public void userClickButtonYesClickAccountSales() {
        tokoSaya.userClickButtonYesClickAccountSales();
    }

    //discover catalog & piutang
    @And("click Katalog Malaka")
    public void clickKatalogMalaka() {
        tokoSaya.clickKatalogMalaka();
    }

    @Then("user on page catalog malaka")
    public void userOnPageCatalogMalaka() {
        tokoSaya.userOnPageCatalogMalaka();
    }

    @And("click piutang")
    public void clickPiutang() {
        tokoSaya.clickPiutang();
    }

    @Then("user on page piutang")
    public void userOnPagePiutang() {
        tokoSaya.userOnPagePiutang();
    }
}
