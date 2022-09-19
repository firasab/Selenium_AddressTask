package pages;

import core.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class viewAddress {
    WebElement addressBtn;

    WebElement driver;

    public viewAddress(WebDriver driver) {
        this.addressBtn = driver.findElement(By.linkText("Show"));
    }

    public void getAddressesProfile(){
        this.addressBtn.click();

    }




}
