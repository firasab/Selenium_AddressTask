import core.OpenBrowsers;
import core.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.*;

public class TestCreateAnAddress {
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = OpenBrowsers.openBrowser("chrome");
        driver.manage().window().maximize();
    }




    @Test
    public void secondTest() throws InterruptedException {

        loginPage resPage = new loginPage(driver);

        Thread.sleep(5000);
        resPage.putInfo("firas.abu.sneneh@hotmail.com", "123");
        Thread.sleep(5000);

        addressPage inPage = new addressPage(driver);
        inPage.getAddresses();
        Thread.sleep(5000);

        WebElement tableWebElement = driver.findElement(By.xpath("/html/body/div/table"));
        Table dataTable = new Table(driver, tableWebElement);
        int rowsNumber = dataTable.getRowNumber();
        System.out.println("number of addresses before adding new address " + rowsNumber);

        newAddressPage newAddressPage = new newAddressPage(driver);
        newAddressPage.newAddressPage();
        Thread.sleep(5000);

        newAddressDetails addressDetails = new newAddressDetails(driver);
        addressDetails.enterInformation("firas", "abu sneneh", "jerusalem", "issaweya", "palestine", "Texas", "123", "Canada", "26", "http://firas.com", "0528076374",  "No" , "Yes", "No");
        Thread.sleep(10000);

        detailsCheck check = new detailsCheck(driver);
        check.checkInformation("firas", "abu sneneh", "jerusalem", "issaweya", "palestine", "TX", "123", "canada", "26", "http://firas.com", "052-807-6374", "No" , "Yes", "No");
        Thread.sleep(10000);

        listPage listP = new listPage(driver);
        listP.getList();
        Thread.sleep(10000);

        WebElement tableWebElementAfterAdd = driver.findElement(By.xpath("/html/body/div/table"));
        Table dataTables = new Table(driver, tableWebElementAfterAdd);
        int rowsNumbers = dataTables.getRowNumber();
        System.out.println("number of addresses after adding new address " + rowsNumbers);


    }








    @BeforeMethod
    public void beforeMethod() {
        driver.get("http://a.testaddressbook.com/sign_in");
    }

}