package pages;

import org.openqa.selenium.*;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MybalencePage {
    By input_useremail= By.xpath("//*[@id=\"input-:R6l6:\"]");
    By input_userpassword= By.xpath("//*[@id=\"input-:Ral6:\"]");
    By input_clickSubmit = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/form/button");
    By input_userOnHomepageMelaka =By.xpath("//*[@id=\"__next\"]/div/div[1]/aside/div/nav/a[1]/button/span/span/span");
    By input_userClickTabMyBalance=By.xpath("/html/body/div[1]/div/div[1]/aside/div/nav/a[2]/button");
    By input_userGetInformationAboutMyBalance= By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/div[1]/p");
    //set date
    By input1_userSetStartFromAndEndDate = By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/div[3]/div[1]/form/div[1]/div[1]/div/div/button");
    By input2_userSetStartFromAndEndDate = By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/div[3]/div[1]/form/div[1]/div[2]/div/div/button");
    By input_userClickApplied= By.xpath("");
    By input_userGetInformationHistoryOfMyBalance=  By.xpath("/html/body/div[1]/div/div[3]/main/div/div[4]/div/div[1]/p");


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

    public void userClickTabMyBalance(){
        try {
            driver.findElement(input_userClickTabMyBalance).click();
        } catch (ElementClickInterceptedException e) {
            // Handle the element click intercepted exception
            System.out.println("Element click intercepted. Handling the issue...");

            // Option 1: Use JavascriptExecutor to click the element
            WebElement element = driver.findElement(input_userClickTabMyBalance);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

        }
    }

    public void userGetInformationAboutMyBalance(){
        WebElement user_userGetInformationAboutMyBalance = driver.findElement(input_userGetInformationAboutMyBalance);
        assertTrue(user_userGetInformationAboutMyBalance.isDisplayed());
        assertEquals("Saldo Saya", user_userGetInformationAboutMyBalance.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userSetStartFromAndEndDate(int day, int month, int year){
        String dateString1 = String.format("01/07/2024", day, month, year);
        String dateString2 = String.format("31/07/2024", day, month, year);
        driver.findElement(input1_userSetStartFromAndEndDate).clear();
        driver.findElement(input1_userSetStartFromAndEndDate).sendKeys(dateString1);
        driver.findElement(input2_userSetStartFromAndEndDate).clear();
        driver.findElement(input2_userSetStartFromAndEndDate).sendKeys(dateString2);
    }

    public void userClickApplied(){
        driver.findElement(input_userClickApplied).click();

    }

    public void userGetInformationHistoryOfMyBalance(){
        WebElement user_userGetInformationHistoryOfMyBalance = driver.findElement(input_userGetInformationHistoryOfMyBalance);
        assertTrue(user_userGetInformationHistoryOfMyBalance.isDisplayed());
        assertEquals("Saldo Saya", user_userGetInformationHistoryOfMyBalance.getText());

        try {
            Thread.sleep(3000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
