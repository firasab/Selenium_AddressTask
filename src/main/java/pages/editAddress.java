package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class editAddress {
    WebElement addressBtn;

    WebElement driver;

    public editAddress(WebDriver driver, int i) {
        int k = i+1;
        this.addressBtn = driver.findElement(By.xpath("/html/body/div/table/tbody/tr["+k+"]/td[6]/a"));
    }

    public void editAddressesProfile(){
        this.addressBtn.click();

    }




}
