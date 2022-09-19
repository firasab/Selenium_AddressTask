package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class newAddressDetails {
    WebDriver driver;
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


    public newAddressDetails(WebDriver driver) {

         this.firstName = driver.findElement(By.id("address_first_name"));
         this.lastName = driver.findElement(By.id("address_last_name"));
         this.address1 = driver.findElement(By.id("address_street_address"));
         this.address2 = driver.findElement(By.id("address_secondary_address"));
         this.city = driver.findElement(By.id("address_city"));
         this.address_zip_code = driver.findElement(By.id("address_zip_code"));
         this.statsElement = driver.findElement(By.id("address_state"));
         this.countryAddressUS = driver.findElement(By.id("address_country_us"));
         this.countryAddressCanda = driver.findElement(By.id("address_country_canada"));
         this.age = driver.findElement(By.id("address_age"));
         this.address_website = driver.findElement(By.id("address_website"));
         this.address_phone = driver.findElement(By.id("address_phone"));
         this.address_interest_climb = driver.findElement(By.id("address_interest_climb"));
         this.address_interest_dance = driver.findElement(By.id("address_interest_dance"));
         this.address_interest_read = driver.findElement(By.id("address_interest_read"));
         this.submitBtn = driver.findElement(By.name("commit"));


    }



    public void enterInformation(String firstName, String lastName, String addresss1,String address2, String city, String state, String zipCode, String country, String age , String website, String phone, String address_interest_climb , String address_interest_dance, String address_interest_read) throws InterruptedException {
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.address1.sendKeys(addresss1);
        this.address2.sendKeys(address2);
        this.city.sendKeys(city);

        Select address_state = new Select(statsElement);
        address_state.selectByVisibleText(state);


        this.address_zip_code.sendKeys(zipCode);

        if ( country == "United States"){
            this.countryAddressUS.click();
        }else {
            this.countryAddressCanda.click();
        }

        this.age.sendKeys(age);
        this.address_website.sendKeys(website);
        this.address_phone.sendKeys(phone);

        if ( address_interest_climb == "Yes") {
            this.address_interest_climb.click();
        }
        if  ( address_interest_dance == "Yes"){
            this.address_interest_dance.click();
        }
        if  ( address_interest_read == "Yes"){
            this.address_interest_read.click();
        }


        this.submitBtn.click();




    }







}
