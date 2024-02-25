package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WebPage;

public class MyStepdefs {
    WebPage webPage;

    public MyStepdefs() {
        this.webPage = new WebPage();
    }

    @Given("user is on page prodia Admin UAT")
    public void userIsOnPageProdiaAdminUAT() {
        webPage.userIsOnPageProdiaAdminUAT();
    }

    @When("user input username {string}")
    public void userInputUsername(String mail) {
        webPage.userInputUsername(mail);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        webPage.userInputPassword(password);
    }

    @And("click continue button")
    public void clickContinueButton() {
        webPage.clickContinueButton();

    }

    @Then("User on Homepage Admin UAT")
    public void userOnHomepageAdminUAT() {
        webPage.userOnHomepageAdminUAT();
    }

    @And("user click admin tranaction")
    public void userClickAdminTranaction() {
        webPage.userClickAdminTranaction();
    }

    @Then("user on page Admin Transaction")
    public void userOnPageAdminTransaction() {
        webPage.userOnPageAdminTransaction();
    }

    //FIlter by, service type, order status and order detail
    @And("user click filter by  service type")
    public void userClickFilterByServiceType() {
        webPage.userClickFilterByServiceType();

    }

    @And("user filter by  service type")
    public void userFilterByServiceType() {
        webPage.userFilterByServiceType();
    }

    @And("user click filter by  order status")
    public void userClickFilterByOrderStatus() {
        webPage.userClickFilterByOrderStatus();
    }

    @And("user filter by  order status")
    public void userFilterByOrderStatus() {
        webPage.userFilterByOrderStatus();
    }

    @And("user click filter by  order detail")
    public void userClickFilterByOrderDetail() {
        webPage.userClickFilterByOrderDetail();

    }
    @And("user filter by  order detail")
    public void userFilterByOrderDetail() {
        webPage.userFilterByOrderDetail();
    }

    @Then("User get result of a filter")
    public void userGetResultOfAFilter() {
        webPage.userGetResultOfAFilter();
    }

    @Then("User can export data transaction")
    public void userCanExportDataTransaction() {
        webPage.userCanExportDataTransaction();
    }


//Search (Admin Transaction) by name user and view order detail
    @And("User Click cloumn search Transaction")
    public void userClickCloumnSearchTransaction() {
        webPage.userClickCloumnSearchTransaction();
    }

    @And("User input keyword {string}")
    public void userInputKeyword(String nameTransaction) {
        webPage.userInputKeyword(nameTransaction);
    }

    @And("User press the enter button on Transaction")
    public void userPressTheEnterButtonOnTransaction() {
        webPage.userPressTheEnterButtonOnTransaction();
    }

    @And("User get result of the search Transaction")
    public void userGetResultOfTheSearchTransaction() {
        webPage.userGetResultOfTheSearchTransaction();
    }

    @And("User Click result of search by ID Transaction")
    public void userClickResultOfSearchByIDTransaction() {
        webPage.userClickResultOfSearchByIDTransaction();
    }

    @Then("user get detail infrom of Transaction")
    public void userGetDetailInfromOfTransaction() {
        webPage.userGetDetailInfromOfTransaction();
    }

//search name of doctor and detail doctor
    @And("User click DHC master pricing")
    public void userClickDHCMasterPricing() {
        webPage.userClickDHCMasterPricing();
    }

    @And("User on page DHC master pricing")
    public void userOnPageDHCMasterPricing() {
        webPage.userOnPageDHCMasterPricing();
    }

    @And("User Click cloumn search")
    public void userClickCloumnSearch() {
        webPage.userClickCloumnSearch();
    }

    @And("User input keyword Doctor {string}")
    public void userInputKeywordDoctor(String inputDoctor) {
        webPage.userInputKeywordDoctor(inputDoctor);
    }

    @And("User press the enter button on DHC")
    public void userPressTheEnterButtonOnDHC() {
        webPage.userPressTheEnterButtonOnDHC();
    }

    @And("User get result of the search DHC")
    public void userGetResultOfTheSearchDHC() {
        webPage.userGetResultOfTheSearchDHC();
    }

    @And("User Click result of search by ID DHC")
    public void userClickResultOfSearchByIDDHC() {
        webPage.userClickResultOfSearchByIDDHC();
    }

    @Then("user get detail infrom of doctor search")
    public void userGetDetailInfromOfDoctorSearch() {
        webPage.userGetDetailInfromOfDoctorSearch();
    }

////filter name of doctor by category and view detail doctor
    @And("user click filter by  verivication Status")
    public void userClickFilterByVerivicationStatus() {
        webPage.userClickFilterByVerivicationStatus();
    }

    @And("user filter by verivication")
    public void userFilterByVerivication() {
        webPage.userFilterByVerivication();
    }


    @And("user click filter by profession")
    public void userClickFilterByProfession() {
        webPage.userClickFilterByProfession();
    }

    @And("user filter by profession")
    public void userFilterByProfession() {
//        webPage.userFilterByProfession();
    }

    @And("user get result of filter doctor")
    public void userGetResultOfFilterDoctor() {
        webPage.userGetResultOfFilterDoctor();
    }

    @And("User Click one of the sample results based on the filter")
    public void userClickOneOfTheSampleResultsBasedOnTheFilter() {
        webPage.userClickOneOfTheSampleResultsBasedOnTheFilter();
    }

    @Then("user get detail infrom of doctor filter")
    public void userGetDetailInfromOfDoctorFilter() {
        webPage.userGetDetailInfromOfDoctorFilter();
    }


}

