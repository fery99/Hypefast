package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class pageHomepage {

    By input_useremail= By.xpath("//*[@id=\"input-:R6l6:\"]");
    By input_userpassword= By.xpath("//*[@id=\"input-:Ral6:\"]");
    By input_clickSubmit = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/form/button");
    By input_userOnHomepageMelaka =By.xpath("//*[@id=\"__next\"]/div/div[1]/aside/div/nav/a[1]/button/span/span/span");
    By input_getInformationOfOvervieewBusiness = By.xpath("//*[@id=\"__next\"]/div/div[1]/aside/div/nav/a[1]/button/span/span/span");
    //shopee
    By input_toColoumnOrderAndClickAccesNeedProcess= By.xpath("//*[@id=\"__next\"]/div/div[3]/main/div/div[4]/div/div[1]/div[1]/div/div/div[2]/div[1]");
    By input_userClickAddConectionOnlieShop= By.xpath("//*[@id=\"__next\"]/div/div[3]/main/div/div[4]/div/div/div/div[1]/div/div[2]/div/div/button/span");
    By input_onListMarketplaceClickAddConectionMarketplace= By.xpath("//*[@id=\"__next\"]/div/div[3]/main/div/div[4]/div/div/div[3]/div[1]/div[2]");
    By input1_userClickSelectOptionAndSelectShopeeMarketplace= By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/div/div/div/button");
    By input2_userClickSelectOptionAndSelectShopeeMarketplace= By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/div/div/div/ul/li[1]");
    By input_userClickConnetionToMarket= By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/div/button[2]");
    By input_authorizeShopeeOpenplatformAPP= By.xpath("/html/body/div[1]/main/div/div[1]/div/div/div/div/div/div[1]/button[2]");
    //Tiktok
    By input_userColoumnOrderAndAccesPerluDiproses= By.xpath("//*[@id=\"__next\"]/div/div[3]/main/div/div[4]/div/div[1]/div[1]/div/div/div[2]/div[2]");
    By input_userClickSelectOptionAndSelectTiktokMarketplace= By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div/div/div/div/ul/li[3]");
    By input_userOnPageTIktokSellerCenter= By.xpath("/html/body/div[1]/div/div/div[2]/div[1]");






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
    public void getInformationOfOvervieewBusiness(){
        WebElement homePageUAT = driver.findElement(input_getInformationOfOvervieewBusiness);
        assertTrue(homePageUAT.isDisplayed());
        assertEquals("Beranda", homePageUAT.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //Shopeee
    public void toColoumnOrderAndClickAccesNeedProcess(){
        driver.findElement(input_toColoumnOrderAndClickAccesNeedProcess).click();
    }

    public void userClickAddConectionOnlieShop(){
        driver.findElement(input_userClickAddConectionOnlieShop).click();

    }

    public void onListMarketplaceClickAddConectionMarketplace(){
        driver.findElement(input_onListMarketplaceClickAddConectionMarketplace).click();
    }

    public void userClickSelectOptionAndSelectShopeeMarketplace(){
//        driver.findElement(input1_userClickSelectOptionAndSelectShopeeMarketplace).clear();
        driver.findElement(input1_userClickSelectOptionAndSelectShopeeMarketplace).click();
        driver.findElement(input2_userClickSelectOptionAndSelectShopeeMarketplace).click();
    }

    public void userClickConnetionToMarket(){
        driver.findElement(input_userClickConnetionToMarket).click();
    }

    public void authorizeShopeeOpenplatformAPP(){

        WebElement user_authorizeShopeeOpenplatformAPP = driver.findElement(input_authorizeShopeeOpenplatformAPP);
        assertTrue(user_authorizeShopeeOpenplatformAPP.isDisplayed());
        assertEquals("Log In", user_authorizeShopeeOpenplatformAPP.getText());

        try {
            Thread.sleep(5000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //Tiktok
    public void userColoumnOrderAndAccesPerluDiproses(){
        driver.findElement(input_userColoumnOrderAndAccesPerluDiproses).click();
    }

    public void userClickSelectOptionAndSelectTiktokMarketplace(){
        driver.findElement(input1_userClickSelectOptionAndSelectShopeeMarketplace).click();
        driver.findElement(input_userClickSelectOptionAndSelectTiktokMarketplace).click();

    }

    public void userOnPageTIktokSellerCenter(){

        WebElement user_userOnPageTIktokSellerCenter = driver.findElement(input_userOnPageTIktokSellerCenter);
        assertTrue(user_userOnPageTIktokSellerCenter.isDisplayed());
        assertEquals("Authorize", user_userOnPageTIktokSellerCenter.getText());

        try {
            Thread.sleep(5000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}


