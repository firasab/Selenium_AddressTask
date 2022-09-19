package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class loginPage {
    WebDriver driver;
    WebElement logInBtn;

    WebElement nameInput;
    WebElement passwordInput;

    WebElement useErr;



    public loginPage(WebDriver driver) {
        this.driver = driver;
        this.passwordInput =   driver.findElement(By.xpath("//*[@id=\"session_password\"]"));
        this.nameInput = driver.findElement(By.xpath("//*[@id=\"session_email\"]"));
        this.logInBtn = driver.findElement(By.xpath("//*[@id=\"clearance\"]/div/div/form/div[3]/input"));


    }

    public void putInfo( String useName, String password){
        try{
            this.nameInput.sendKeys(useName);
            this.passwordInput.sendKeys(password);
            this.logInBtn.click();
        }catch (Exception e){
            System.out.println(e);
        }


    }


}