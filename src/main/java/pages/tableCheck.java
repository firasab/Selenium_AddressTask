package pages;

import core.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.AssertJUnit.assertEquals;

public class tableCheck {

    String firstName ;
    String lastName ;
    String city ;
    String statsElement ;

    public tableCheck(WebDriver driver , int number) {
        WebElement tableWebElement = driver.findElement(By.xpath("/html/body/div/table"));
        Table dataTable = new Table(driver, tableWebElement);

        this.firstName = dataTable.getCellValue(number, "First name");
        this.lastName =dataTable.getCellValue(number, "Last name");
        this.city = dataTable.getCellValue(number, "City");
        this.statsElement = dataTable.getCellValue(number, "State");
    }

    public void checkInformation(String firstName, String lastName,String city, String state) throws InterruptedException {

        assertEquals(firstName, this.firstName);
        assertEquals(lastName, this.lastName);
        assertEquals(city, this.city);
        assertEquals(state, this.statsElement);


    }

}
