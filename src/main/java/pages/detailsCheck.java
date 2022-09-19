package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.AssertJUnit.assertEquals;

public class detailsCheck {

    WebElement firstName ;
    WebElement lastName ;
    WebElement address1 ;

    WebElement address2 ;

    WebElement city ;

    WebElement address_zip_code ;

    WebElement statsElement ;

    WebElement countryAddressUS ;

    WebElement countryAddressCanda ;

    WebElement age ;

    WebElement address_website ;

    WebElement address_phone ;

    WebElement address_interest_climb ;

    WebElement address_interest_dance ;

    WebElement address_interest_read ;

    WebElement submitBtn ;




    public detailsCheck(WebDriver driver) {

        this.firstName = driver.findElement(By.xpath("/html/body/div/p[1]/span[2]"));
        this.lastName = driver.findElement(By.xpath("/html/body/div/p[2]/span[2]"));
        this.address1 = driver.findElement(By.xpath("/html/body/div/p[3]/span[2]"));
        this.address2 = driver.findElement(By.xpath("/html/body/div/p[4]/span[2]"));
        this.city = driver.findElement(By.xpath("/html/body/div/p[5]/span[2]"));
        this.address_zip_code = driver.findElement(By.xpath("/html/body/div/p[7]/span[2]"));
        this.statsElement = driver.findElement(By.xpath("/html/body/div/p[6]/span[2]"));
        this.countryAddressUS = driver.findElement(By.xpath("/html/body/div/p[8]/span[2]"));
        this.countryAddressCanda = driver.findElement(By.xpath("/html/body/div/p[8]/span[2]"));
        this.age = driver.findElement(By.xpath("/html/body/div/p[11]/span[2]"));
        this.address_website = driver.findElement(By.xpath("/html/body/div/p[12]/span[2]"));
        this.address_phone = driver.findElement(By.xpath("/html/body/div/p[13]/span[2]"));
        this.address_interest_climb = driver.findElement(By.xpath("/html/body/div/p[14]/span[2]"));
        this.address_interest_dance = driver.findElement(By.xpath("/html/body/div/p[15]/span[2]"));
        this.address_interest_read = driver.findElement(By.xpath("/html/body/div/p[16]/span[2]"));
        this.submitBtn = driver.findElement(By.linkText("List"));


    }



    public void checkInformation(String firstName, String lastName, String addresss1,String address2, String city, String state, String zipCode, String country, String age , String website, String phone, String climb, String dance, String read) throws InterruptedException {

        assertEquals(firstName, this.firstName.getText());
        assertEquals(lastName, this.lastName.getText());
        assertEquals(addresss1, this.address1.getText());
        assertEquals(address2, this.address2.getText());
        assertEquals(city, this.city.getText());
        assertEquals(zipCode, this.address_zip_code.getText());
        assertEquals(state, this.statsElement.getText());
        assertEquals(country, this.countryAddressUS.getText());
        assertEquals(country, this.countryAddressCanda.getText());
        assertEquals(age, this.age.getText());
        assertEquals(website, this.address_website.getText());
        assertEquals(phone, this.address_phone.getText());
        assertEquals(climb, this.address_interest_climb.getText());
        assertEquals(dance, this.address_interest_dance.getText());
        assertEquals(read, this.address_interest_read.getText());

    }

}

