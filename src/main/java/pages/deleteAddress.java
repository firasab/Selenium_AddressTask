package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class deleteAddress {
    WebElement addressBtn;

    WebElement driver;

    public deleteAddress(WebDriver driver) {
        this.addressBtn = driver.findElement(By.linkText("Destroy"));
    }

    public void deleteAddressesProfile() {
        this.addressBtn.click();


    }
}
