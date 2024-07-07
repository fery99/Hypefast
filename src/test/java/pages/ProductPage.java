package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductPage {
    By input_useremail= By.xpath("//*[@id=\"input-:R6l6:\"]");
    By input_userpassword= By.xpath("//*[@id=\"input-:Ral6:\"]");
    By input_clickSubmit = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/form/button");
    By input_userOnHomepageMelaka =By.xpath("//*[@id=\"__next\"]/div/div[1]/aside/div/nav/a[1]/button/span/span/span");
    //discover
    By input_userClickProductAndStock= By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/button[2]");
    By input_clickProduct= By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/div[2]/a[1]/button/span");
    By input_userGetInformListOfProduct= By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/div[2]/a[1]/button/span");
    //edit
    By input_userClickSelectAndClickChange= By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/div[2]/div[2]/div[3]/div/div[4]/span/button");
    By input2_userClickSelectAndClickChange=By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/div[2]/div[2]/div[3]/div/div[4]/span/div/div/button[1]");
    By input_userOnEditPageAndScrollDown= By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/h1");
    By input_userEditWeight= By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/div[2]/form/div[1]/div[1]/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div/input");
    By input_userEditDimensionProductHeight= By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/div[2]/form/div[1]/div[1]/div[2]/div/div[3]/div/div[2]/div[2]/div/div[1]/div/div/input");
    By input_userClickSave= By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/div[2]/form/div[2]/button[1]");
    By input_userCanSeeProductHasBeenEditedOnList= By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/div[2]/a[1]/button/span");
    //Stok Inventory
    By input_clickInventoryStock= By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/div[2]/a[2]/button/span");
    By input_userGetListOfProduct= By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/div[2]/a[2]/button/span");
    By input_userIconPilih= By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/div[2]/div[2]/div[2]/div[2]/div/div[6]/span/button");
    By input_userClickMapingOfStock= By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/div[2]/div[2]/div[2]/div[2]/div/div[6]/span/div/div/button[1]");
    By input_userCanSeeDetailInformationAboutMapingStock= By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[2]/form/div/div[5]/button[1]");






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

    //cannot add
    public void userClickProductAndStock(){
        driver.findElement(input_userClickProductAndStock).click();
    }

    public void clickProduct(){
        driver.findElement(input_clickProduct).click();
    }

    public void userGetInformListOfProduct(){
        WebElement user_userGetInformListOfProduct = driver.findElement(input_userGetInformListOfProduct);
        assertTrue(user_userGetInformListOfProduct.isDisplayed());
        assertEquals("Produk", user_userGetInformListOfProduct.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //edit
    public void userClickSelectAndClickChange(){
        driver.findElement(input_userClickSelectAndClickChange).click();
        driver.findElement(input2_userClickSelectAndClickChange).click();
    }

    public void userOnEditPageAndScrollDown(){
        WebElement user_userOnEditPageAndScrollDown = driver.findElement(input_userOnEditPageAndScrollDown);
        assertTrue(user_userOnEditPageAndScrollDown.isDisplayed());
        assertEquals("Ubah Produk", user_userOnEditPageAndScrollDown.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)"); // Scroll down by 1000 pixels

        try {
            Thread.sleep(3000); // Jeda selama 3 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userEditWeight(String weight){
        driver.findElement(input_userEditWeight).clear();
        driver.findElement(input_userEditWeight).sendKeys(weight);
    }

    public void userEditDimensionProductHeight(String height){
        driver.findElement(input_userEditDimensionProductHeight).clear();
        driver.findElement(input_userEditDimensionProductHeight).sendKeys(height);
    }

    public void userClickSave(){
        driver.findElement(input_userClickSave).click();
    }

    public void userCanSeeProductHasBeenEditedOnList(){
        WebElement user_userCanSeeProductHasBeenEditedOnList = driver.findElement(input_userCanSeeProductHasBeenEditedOnList);
        assertTrue(user_userCanSeeProductHasBeenEditedOnList.isDisplayed());
        assertEquals("Produk", user_userCanSeeProductHasBeenEditedOnList.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //stok inventory
    public void clickInventoryStock(){
        driver.findElement(input_clickInventoryStock). click();
    }

    public void userGetListOfProduct(){
        WebElement user_userGetListOfProduct = driver.findElement(input_userGetListOfProduct);
        assertTrue(user_userGetListOfProduct.isDisplayed());
        assertEquals("Stok Inventori", user_userGetListOfProduct.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userIconPilih(){
        driver.findElement(input_userIconPilih).click();

    }

    public void userClickMapingOfStock(){
        driver.findElement(input_userClickMapingOfStock).click();
    }

    public void userCanSeeDetailInformationAboutMapingStock(){
        WebElement user_userCanSeeDetailInformationAboutMapingStock = driver.findElement(input_userCanSeeDetailInformationAboutMapingStock);
        assertTrue(user_userCanSeeDetailInformationAboutMapingStock.isDisplayed());
        assertEquals("Kembali", user_userCanSeeDetailInformationAboutMapingStock.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
