package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class listPage {
    WebElement addressBtn;

    public listPage(WebDriver driver) {
        this.addressBtn = driver.findElement(By.linkText("List"));
    }

    public void getList(){
        this.addressBtn.click();

    }
}
