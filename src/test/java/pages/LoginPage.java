package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {

    By input_useremail= By.xpath("//*[@id=\"input-:R6l6:\"]");
    By input_userpassword= By.xpath("//*[@id=\"input-:Ral6:\"]");
    By input_clickSubmit = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/form/button");
    //Red Alert Harap isi dengan benar
    By input_RedAlerat = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/form/div[1]/div[2]/p");
    //RedAlert Wajib Diiisi
    By input_RedAleratt = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/form/div[1]/div[2]/p");
    //RedAlert ga sesuaai
    By input_redalerttt= By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/form/div[2]/div[2]/p");
    //RedAlert dashboard Melaka
    By input_userOnHomepageMelaka =By.xpath("//*[@id=\"__next\"]/div/div[1]/aside/div/nav/a[1]/button/span/span/span");


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


    public void userGetRedAlert(String RedAlert){
        WebElement homePageUAT = driver.findElement(input_RedAlerat);
        assertTrue(homePageUAT.isDisplayed());
        assertEquals(RedAlert, homePageUAT.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void userOnHomepageDashnoard(){
        WebElement homePageUAT = driver.findElement(input_userOnHomepageMelaka);
        assertTrue(homePageUAT.isDisplayed());
        assertEquals("Beranda", homePageUAT.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userGetRedAlertt(String Redalert){
        WebElement homePageUAT = driver.findElement(input_RedAleratt);
        assertTrue(homePageUAT.isDisplayed());
        assertEquals(Redalert, homePageUAT.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userGetRedAlerttt(String redalerttt){
        WebElement homePageUAT = driver.findElement(input_redalerttt);
        assertTrue(homePageUAT.isDisplayed());
        assertEquals(redalerttt, homePageUAT.getText());

        try {
            Thread.sleep(3000); // Jeda selama 3 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
