package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;
import pages.TokoSayaPage;

public class Productstepdef {

    ProductPage pageProduct;

    public Productstepdef() {
        this.pageProduct = new ProductPage();
    }


    @Given("user on login page of Melaka-")
    public void userOnLoginPageOfMelaka() {
        pageProduct.userOnLoginPageOfMelaka();

    }

    @When("input email- {string}")
    public void inputEmail(String Email) {
        pageProduct.inputEmail(Email);

    }

    @And("input password- {string}")
    public void inputPassword(String Password) {
        pageProduct.inputPassword(Password);
    }

    @And("click loggin button-")
    public void clickLogginButton() {
        pageProduct.clickLogginButton();

    }

    @And("user on homepage dashboard-")
    public void userOnHomepageDashboard() {
        pageProduct.userOnHomepageDashboard();

    }

    @And("user click Product and Stock")
    public void userClickProductAndStock() {
        pageProduct.userClickProductAndStock();
    }

    @And("click product")
    public void clickProduct() {
        pageProduct.clickProduct();
    }

    @Then("User get inform list of product")
    public void userGetInformListOfProduct() {
        pageProduct.userGetInformListOfProduct();
    }


    //edit
    @And("user click select and click change")
    public void userClickSelectAndClickChange() {
        pageProduct.userClickSelectAndClickChange();
    }

    @And("User on edit page and scroll down")
    public void userOnEditPageAndScrollDown() {
        pageProduct.userOnEditPageAndScrollDown();
    }

    @And("user edit weight {string}")
    public void userEditWeight(String weight) {
        pageProduct.userEditWeight(weight);
    }

    @And("user edit dimension product height {string}")
    public void userEditDimensionProductHeight(String height) {
        pageProduct.userEditDimensionProductHeight(height);
    }

    @And("user click save")
    public void userClickSave() {
        pageProduct.userClickSave();
    }

    @Then("user can see product has been edited on list")
    public void userCanSeeProductHasBeenEditedOnList() {
        pageProduct.userCanSeeProductHasBeenEditedOnList();
    }

//rtok inventory
    @And("click inventory Stock")
    public void clickInventoryStock() {
        pageProduct.clickInventoryStock();
    }

    @And("User get list of product")
    public void userGetListOfProduct() {
        pageProduct.userGetListOfProduct();
    }

    @And("user icon pilih")
    public void userIconPilih() {
        pageProduct.userIconPilih();
    }

    @And("user click maping of stock")
    public void userClickMapingOfStock() {
        pageProduct.userClickMapingOfStock();
    }

    @Then("user can see detail information about maping stock")
    public void userCanSeeDetailInformationAboutMapingStock() {
        pageProduct.userCanSeeDetailInformationAboutMapingStock();
    }
}
