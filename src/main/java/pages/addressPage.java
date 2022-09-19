package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addressPage {
    WebElement addressBtn;

    public addressPage(WebDriver driver) {
        this.addressBtn = driver.findElement(By.linkText("Addresses"));
    }

    public void getAddresses(){
        this.addressBtn.click();

    }
}
