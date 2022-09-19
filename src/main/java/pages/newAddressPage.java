package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class newAddressPage {
    WebElement newAddressesPage;


    public newAddressPage(WebDriver driver) {
        this.newAddressesPage = driver.findElement(By.linkText("New Address"));
    }

    public void newAddressPage(){
        this.newAddressesPage.click();

    }
}
