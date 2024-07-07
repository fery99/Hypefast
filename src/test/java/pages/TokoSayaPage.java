package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TokoSayaPage {

    By input_useremail= By.xpath("//*[@id=\"input-:R6l6:\"]");
    By input_userpassword= By.xpath("//*[@id=\"input-:Ral6:\"]");
    By input_clickSubmit = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/form/button");
    By input_userOnHomepageMelaka =By.xpath("//*[@id=\"__next\"]/div/div[1]/aside/div/nav/a[1]/button/span/span/span");
    //Red Alert
    By input_clickTabStore= By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/button[1]");
    By input_clickTimSales= By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/div[2]/a[1]/button/span");
    By input_clickAddSales= By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/div[2]/button");
    By input_inputName=By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/input");
    By input_input= By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/input");
    By input_inputEmailSalese= By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[2]/div[1]/div[3]/div/input");
    By input_clickSaveButton= By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[2]/div[2]/button[2]");
    By input_userCanSeeRedAlert= By.xpath("/div/div");
    By input_userGetUpdateInformationOnPage= By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/div[2]/a[1]/button/span");
    //Delete
    By input_userClickIconTrash= By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/div[2]/table/tbody/tr/td[6]/span/button");
    By input_userSeePopUpSureDeleteAccountSales= By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[1]/h2");
    By input_userClickButtonYesClickAccountSales= By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[2]/div/div/button[2]");
    //discover catalog & Piutang
    By input_clickKatalogMalaka= By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/div[2]/a[3]/button/span");
    By input_userOnPageCatalogMalaka= By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/div[2]/a[3]/button/span");
    By input_clickPiutang= By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/div[2]/a[4]/button/span");
    By input_userOnPagePiutang= By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/div[2]/a[4]/button/span");

    public void userOnLoginPageOfMelaka(){
        driver.get("https://dashboard.melaka.app/login");
    }

    public void inputEmail(String mail){
        driver.findElement(input_useremail).clear();
        driver.findElement(input_useremail).sendKeys(mail);
    }

    public void inputPassword(String password){
        driver.findElement(input_userpassword).clear();
        driver.findElement(input_userpassword).sendKeys(password);
    }

    public void clickLogginButton(){
        driver.findElement(input_clickSubmit).click();
    }

    public void userOnHomepageDashboard(){
        WebElement homePageUAT = driver.findElement(input_userOnHomepageMelaka);
        assertTrue(homePageUAT.isDisplayed());
        assertEquals("Beranda", homePageUAT.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickTabStore(){
        driver.findElement(input_clickTabStore).click();
    }

    public void clickTimSales(){
        driver.findElement(input_clickTimSales).click();
    }

    public void clickAddSales(){
        driver.findElement(input_clickAddSales).click();
    }

    public void inputName(String Nama){
        driver.findElement(input_inputName).sendKeys(Nama);
    }

    public void input(String input){
        driver.findElement(input_input).clear();
        driver.findElement(input_input).sendKeys(input);
    }

    public void inputEmailSalese(String Emaill){
        driver.findElement(input_inputEmailSalese).sendKeys(Emaill);
    }

    public void userCanSeeRedAlert(String Alert){
        WebElement user_userCanSeeRedAlert = driver.findElement(input_userCanSeeRedAlert);
        assertTrue(user_userCanSeeRedAlert.isDisplayed());
        assertEquals(Alert, user_userCanSeeRedAlert.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void clickSaveButton(){
        driver.findElement(input_clickSaveButton).click();
    }

    public void userGetUpdateInformationOnPage(){
        WebElement user_userGetUpdateInformationOnPage = driver.findElement(input_userGetUpdateInformationOnPage);
        assertTrue(user_userGetUpdateInformationOnPage.isDisplayed());
        assertEquals("Tim Sales", user_userGetUpdateInformationOnPage.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userClickIconTrash(){
        driver.findElement(input_userClickIconTrash).click();
    }

    public void userSeePopUpSureDeleteAccountSales(){
        driver.findElement(input_userSeePopUpSureDeleteAccountSales).click();
    }

    public void userClickButtonYesClickAccountSales(){
        driver.findElement(input_userClickButtonYesClickAccountSales).click();
    }

    //Discover catalog & piutang
    public void clickKatalogMalaka(){
        driver.findElement(input_clickKatalogMalaka).click();
    }

    public void userOnPageCatalogMalaka(){
        WebElement user_userOnPageCatalogMalaka = driver.findElement(input_userOnPageCatalogMalaka);
        assertTrue(user_userOnPageCatalogMalaka.isDisplayed());
        assertEquals("Katalog Melaka", user_userOnPageCatalogMalaka.getText());

        try {
            Thread.sleep(3000); // Jeda selama 3 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickPiutang(){
        driver.findElement(input_clickPiutang).click();
    }

    public void userOnPagePiutang(){
        WebElement user_userOnPagePiutang = driver.findElement(input_userOnPagePiutang);
        assertTrue(user_userOnPagePiutang.isDisplayed());
        assertEquals("Piutang", user_userOnPagePiutang.getText());

        try {
            Thread.sleep(3000); // Jeda selama 3 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
