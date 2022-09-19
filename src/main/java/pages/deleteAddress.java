package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class deleteAddress {
    WebElement addressBtn;

    WebElement driver;

    public deleteAddress(WebDriver driver , int i ) {
        int k = i+1;
        this.addressBtn = driver.findElement(By.linkText("/html/body/div/table/tbody/tr["+k+"]/td[7]/a"));
    }

    public void deleteAddressesProfile() {
        this.addressBtn.click();


    }
}
