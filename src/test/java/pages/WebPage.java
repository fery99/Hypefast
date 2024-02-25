package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static helper.Utility.driver;
import static org.bouncycastle.asn1.crmf.SinglePubInfo.web;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebPage {
    By input_userInputUsername= By.xpath("//*[@id=\"username\"]");
    By input_userInputPassword= By.xpath("//*[@id=\"password\"]");
    By input_clickContinueButton= By.xpath("/html/body/div/main/section/div/div/div/form/div[2]/button");
    By input_userOnHomepageAdminUAT=By.xpath("//*[@id=\"__next\"]/section/section/main/div/div[2]");

//Access Transaction
    By input_userClickAdminTranaction= By.xpath("//*[@id=\"__next\"]/section/section/aside/div/div/div[2]/div/div[2]/div/ul/li[4]/a");
    By input_userOnPageAdminTransaction=By.xpath("//*[@id=\"__next\"]/section/section/main/div[1]/h4");

//FIlter by order list, order status and order detail
    By input_userClickFilterByServiceType= By.xpath("//*[@id=\"__next\"]/section/section/main/div[3]/div[1]/div[1]/div/div/div[2]/div/div[1]/div");
    By input_userFilterByServiceType= By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/div[3]/div");
    By input_userClickFilterByOrderStatus=By.xpath("//*[@id=\"__next\"]/section/section/main/div[3]/div[1]/div[2]/div/div/div[2]/div/div[1]/div");
    By input_userFilterByOrderStatus= By.xpath("/html/body/div[3]/div/div/div/div/div/div[2]/div[1]/div/div/div[4]/div");
    By input_userClickFilterByOrderDetail= By.xpath("//*[@id=\"__next\"]/section/section/main/div[3]/div[1]/div[3]/div/div/div[2]/div/div[1]/div");
    By input_userFilterByOrderDetail= By.xpath("/html/body/div[4]/div/div/div/div/div/div[2]/div[1]/div/div/div[4]/div");
    By input_userGetResultOfAFilter= By.xpath("//*[@id=\"__next\"]/section/section/main/div[4]/div[2]/div/div/div/div/div/table/thead/tr/th[1]/div/span[1]");
    By input_userCanExportDataTransaction=By.xpath("//*[@id=\"__next\"]/section/section/main/div[3]/div[2]/div/button");

//Search (Admin Transaction) by name user and view order detail
    By input_userClickCloumnSearchTransaction= By.xpath("//*[@id=\"__next\"]/section/section/main/div[1]/div/span/input");
    By input_userInputKeyword= By.xpath("//*[@id=\"__next\"]/section/section/main/div[1]/div/span/input");
    By input_userPressTheEnterButtonOnTransaction= By.xpath("//*[@id=\"__next\"]/section/section/main/div[1]/div/span/input");
    By input_userGetResultOfTheSearchTransaction= By.xpath("//*[@id=\"__next\"]/section/section/main/div[4]/div[2]/div/div/div/div/div/table/thead/tr/th[1]/div/span[1]");
    By input_userClickResultOfSearchByIDTransaction= By.xpath("//*[@id=\"__next\"]/section/section/main/div[4]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[1]/span");
    By input_userGetDetailInfromOfTransaction= By.xpath("//*[@id=\"__next\"]/section/section/main/div[3]/div/div[1]/div/div[2]/span");

////search name of doctor and detail doctor
    By input_userClickDHCMasterPricing= By.xpath("//*[@id=\"__next\"]/section/section/aside/div/div/div[3]/div/div[2]/div/ul/li[11]/a");
    By input_userOnPageDHCMasterPricing=By.xpath("//*[@id=\"__next\"]/section/section/main/div[1]/h4");
    By input_userClickCloumnSearch= By.xpath("//*[@id=\"__next\"]/section/section/main/div[1]/div/span/input");
    By input_userInputKeywordDoctor= By.xpath("//*[@id=\"__next\"]/section/section/main/div[1]/div/span/input");
    By input_userPressTheEnterButtonOnDHC= By.xpath("//*[@id=\"__next\"]/section/section/main/div[1]/div/span/input");
    By input_userGetResultOfTheSearchDHC= By.xpath("//*[@id=\"__next\"]/section/section/main/div[4]/div[2]/div/div/div/div/div/table/thead/tr/th[6]/div/span[1]");
    By input_userClickResultOfSearchByIDDHC= By.xpath("//*[@id=\"__next\"]/section/section/main/div[4]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[1]/div/span");
    By input_userGetDetailInfromOfDoctorSearch= By.xpath("//*[@id=\"rc-tabs-0-panel-1\"]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[1]");

////filter name of doctor by category and view detail doctor
    By input_userClickFilterByVerivicationStatus=By.xpath("//*[@id=\"__next\"]/section/section/main/div[3]/div/div[1]/div/div/div[2]/div/div[1]/div");
    By input_userFilterByVerivication= By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div");
    By input_userClickFilterByProfession= By.xpath("//*[@id=\"__next\"]/section/section/main/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div");
    By input_userFilterByProfession= By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/div[5]/div");
    By input_userGetResultOfFilterDoctor= By.xpath("//*[@id=\"__next\"]/section/section/main/div[4]/div[2]/div/div/div/div/div/table/tbody/tr[6]/td[1]/div/span");
    By input_userClickOneOfTheSampleResultsBasedOnTheFilter= By.xpath("//*[@id=\"__next\"]/section/section/main/div[4]/div[2]/div/div/div/div/div/table/tbody/tr[6]/td[1]/div/span");
    By input_userGetDetailInfromOfDoctorFilter= By.xpath("//*[@id=\"rc-tabs-0-panel-1\"]/div/div[2]/div[2]/div/table/tbody/tr[3]/td[1]");







    public void userIsOnPageProdiaAdminUAT(){
        driver.get("https://admin-uat-v2.prodiadigital.com/");
    }

    public void userInputUsername(String mail){
        driver.findElement(input_userInputUsername).sendKeys(mail);
    }

    public void userInputPassword(String password){
        driver.findElement(input_userInputPassword).sendKeys(password);
    }

    public void clickContinueButton(){
        driver.findElement(input_clickContinueButton).click();
    }

    public void userOnHomepageAdminUAT(){
        WebElement homePageUAT = driver.findElement(input_userOnHomepageAdminUAT);
        assertTrue(homePageUAT.isDisplayed());
        assertEquals("Welcome to the Admin App", homePageUAT.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//Admin Transaction
    public void userClickAdminTranaction(){
        driver.findElement(input_userClickAdminTranaction).click();
    }

    public void userOnPageAdminTransaction(){
        WebElement pageAdmin = driver.findElement(input_userOnPageAdminTransaction);
        assertTrue(pageAdmin.isDisplayed());
        assertEquals("Transaction", pageAdmin.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//FIlter by, service type, order status and order detail

    public void userClickFilterByServiceType(){
        driver.findElement(input_userClickFilterByServiceType).click();
    }

    public void userFilterByServiceType(){
        driver.findElement(input_userFilterByServiceType).click();
    }

    public void userClickFilterByOrderStatus(){
        driver.findElement(input_userClickFilterByOrderStatus).click();

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userFilterByOrderStatus(){
        driver.findElement(input_userFilterByOrderStatus).click();
    }

    public void userClickFilterByOrderDetail(){
        driver.findElement(input_userClickFilterByOrderDetail).click();

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userFilterByOrderDetail(){
        driver.findElement(input_userFilterByOrderDetail).click();
    }

    public void userGetResultOfAFilter(){
        WebElement parttUserGetResultOfAFilter = driver.findElement(input_userGetResultOfAFilter);
        assertTrue(parttUserGetResultOfAFilter.isDisplayed());
        assertEquals("Order ID", parttUserGetResultOfAFilter.getText());
    }

    public void userCanExportDataTransaction(){
        driver.findElement(input_userCanExportDataTransaction).click();

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

////Search (Admin Transaction) by name user and view order detail
    public void userClickCloumnSearchTransaction(){
        driver.findElement(input_userClickCloumnSearchTransaction).click();
    }

    public void userInputKeyword(String nameTransaction){
        driver.findElement(input_userInputKeyword).sendKeys(nameTransaction);
    }

    public void userPressTheEnterButtonOnTransaction(){
        driver.findElement(input_userPressTheEnterButtonOnTransaction).sendKeys(Keys.ENTER);
    }
    public void userGetResultOfTheSearchTransaction(){
        WebElement resultTransaction = driver.findElement(input_userGetResultOfTheSearchTransaction);
        assertTrue(resultTransaction.isDisplayed());
        assertEquals("Order ID", resultTransaction.getText());

        try{
            Thread.sleep(7000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userClickResultOfSearchByIDTransaction(){
        driver.findElement(input_userClickResultOfSearchByIDTransaction).click();
    }

    public void userGetDetailInfromOfTransaction(){
        WebElement resultInformTransaction = driver.findElement(input_userGetDetailInfromOfTransaction);
        assertTrue(resultInformTransaction.isDisplayed());
        assertEquals("2024020100037429", resultInformTransaction. getText());

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

////search name of doctor and detail doctor
    public void userClickDHCMasterPricing(){
        driver.findElement(input_userClickDHCMasterPricing).click();
    }

    public void userOnPageDHCMasterPricing(){
        WebElement resultPageDHC = driver.findElement(input_userOnPageDHCMasterPricing);
        assertTrue(resultPageDHC.isDisplayed());
        assertEquals("DHC Master Pricing", resultPageDHC.getText());

//        System.out.println("ini adalah text"+ resultPageDHC);

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userClickCloumnSearch(){
        driver.findElement(input_userClickCloumnSearch).click();
    }

    public void userInputKeywordDoctor(String inputDoctor){
        driver.findElement(input_userInputKeywordDoctor).sendKeys(inputDoctor);
    }

    public void userPressTheEnterButtonOnDHC(){
        driver.findElement(input_userPressTheEnterButtonOnDHC).sendKeys(Keys.ENTER);
    }

    public void userGetResultOfTheSearchDHC() {
        WebElement resultOfSearchDHC = driver.findElement(input_userGetResultOfTheSearchDHC);
        assertTrue(resultOfSearchDHC.isDisplayed());
        assertEquals("In Clinic Consultation", resultOfSearchDHC.getText());

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userClickResultOfSearchByIDDHC(){
        driver.findElement(input_userClickResultOfSearchByIDDHC).click();
    }

    public void userGetDetailInfromOfDoctorSearch(){
        WebElement resultDetailDoctor= driver.findElement(input_userGetDetailInfromOfDoctorSearch);
        assertTrue(resultDetailDoctor.isDisplayed());
        assertEquals("Languages", resultDetailDoctor.getText());


        System.out.println(resultDetailDoctor.getText());


        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

////filter name of doctor by category and view detail doctor
    public void userClickFilterByVerivicationStatus(){
        driver.findElement(input_userClickFilterByVerivicationStatus).click();
    }

    public void userFilterByVerivication(){
        driver.findElement(input_userFilterByVerivication).click();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userClickFilterByProfession(){
        driver.findElement(input_userClickFilterByProfession).click();


        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userFilterByProfession(){
        driver.findElement(input_userFilterByProfession).click();

        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }


    public void userGetResultOfFilterDoctor(){
        WebElement resultFilterDoctor= driver.findElement(input_userGetResultOfFilterDoctor);
        assertTrue(resultFilterDoctor.isDisplayed());
        assertEquals("Y000025",resultFilterDoctor.getText());


        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userClickOneOfTheSampleResultsBasedOnTheFilter(){
        driver.findElement(input_userClickOneOfTheSampleResultsBasedOnTheFilter).click();
    }

    public void userGetDetailInfromOfDoctorFilter() {
        WebElement resultDetailFilterDoctor = driver.findElement(input_userGetDetailInfromOfDoctorFilter);
        assertTrue(resultDetailFilterDoctor.isDisplayed());
        assertEquals("Specialisation", resultDetailFilterDoctor.getText());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
