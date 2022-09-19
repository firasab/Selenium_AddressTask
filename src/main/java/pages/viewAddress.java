package pages;

import core.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class viewAddress {
    WebElement addressBtn;


    public viewAddress(WebDriver driver, int i) {
        int k = i+1;
        this.addressBtn = driver.findElement(By.xpath("/html/body/div/table/tbody/tr["+k+"]/td[5]/a"));
    }

    // use it by xpath and send to the function the i of the td
    public void getAddressesProfile( ){
        this.addressBtn.click();

    }




}
