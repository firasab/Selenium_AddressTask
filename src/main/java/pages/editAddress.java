package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class editAddress {
    WebElement addressBtn;

    WebElement driver;

    public editAddress(WebDriver driver) {
        this.addressBtn = driver.findElement(By.linkText("Edit"));
    }

    public void editAddressesProfile(){
        this.addressBtn.click();

    }




}
