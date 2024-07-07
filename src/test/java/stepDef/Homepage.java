package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pageHomepage;

public class Homepage {

    pageHomepage homePage;

    public Homepage() {
        this.homePage = new pageHomepage();
    }
    @Given("user on login page of Melaka@")
    public void userOnLoginPageOfMelaka() {
        homePage.userOnLoginPageOfMelaka();
    }

    @When("input email@ {string}")
    public void inputEmail(String Email) {
        homePage.inputEmail(Email);
    }

    @And("input password@ {string}")
    public void inputPassword(String Password) {
        homePage.inputPassword(Password);
    }

    @And("click loggin button@")
    public void clickLogginButton() {
        homePage.clickLogginButton();
    }

    @And("user on homepage dashboard@")
    public void userOnHomepageDashboard() {
        homePage.userOnHomepageDashboard();
    }

    @Then("get information of Overvieew Business")
    public void getInformationOfOvervieewBusiness() {
        homePage.getInformationOfOvervieewBusiness();
    }

    @And("to coloumn order and click acces need process")
    public void toColoumnOrderAndClickAccesNeedProcess() {
        homePage.toColoumnOrderAndClickAccesNeedProcess();
    }

    @And("user click add conection onlie shop")
    public void userClickAddConectionOnlieShop() {
        homePage.userClickAddConectionOnlieShop();
    }

    @And("on list marketplace click add conection Marketplace")
    public void onListMarketplaceClickAddConectionMarketplace() {
        homePage.onListMarketplaceClickAddConectionMarketplace();
    }

    @And("user click select option and select Shopee marketplace")
    public void userClickSelectOptionAndSelectShopeeMarketplace() {
        homePage. userClickSelectOptionAndSelectShopeeMarketplace();
    }

    @And("user click connetion to market")
    public void userClickConnetionToMarket() {
        homePage.userClickConnetionToMarket();
    }

    @Then("Authorize Shopee Openplatform APP")
    public void authorizeShopeeOpenplatformAPP() {
        homePage.authorizeShopeeOpenplatformAPP();
    }

    @And("user coloumn order and acces perlu diproses")
    public void userColoumnOrderAndAccesPerluDiproses() {
        homePage.userColoumnOrderAndAccesPerluDiproses();
    }

    @And("user click select option and select Tiktok marketplace")
    public void userClickSelectOptionAndSelectTiktokMarketplace() {
        homePage.userClickSelectOptionAndSelectTiktokMarketplace();
    }

    @Then("user on page TIktok Seller Center")
    public void userOnPageTIktokSellerCenter() {
        homePage.userOnPageTIktokSellerCenter();
    }
}
