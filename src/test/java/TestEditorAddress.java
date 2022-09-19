import core.OpenBrowsers;
import core.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.*;

public class TestEditorAddress {
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = OpenBrowsers.openBrowser("chrome");
        driver.manage().window().maximize();
    }




    @Test
    public void secondTest() throws InterruptedException {

        loginPage resPage = new loginPage(driver);
        String SearchedName = "samer";

        Thread.sleep(5000);
        resPage.putInfo("firas.abu.sneneh@hotmail.com", "123");
        Thread.sleep(5000);

        addressPage inPage = new addressPage(driver);
        inPage.getAddresses();
        Thread.sleep(5000);

        WebElement tableWebElement = driver.findElement(By.xpath("/html/body/div/table"));
        Table dataTable = new Table(driver, tableWebElement);
        int rowsNumber = dataTable.getRowNumber();
        System.out.println(rowsNumber);


        for ( int i = 0; i<rowsNumber; i++) {
            //get the value of the First Name cells
            String name = dataTable.getCellValue(i, "First name");

            //////////////////////////// Error ///////////////////////////////
            //// how to click the wanted name show/////////////////////////////////////////////

            //check if the name is same - if it is the name then open his profile
            if (name.equals(SearchedName)) {
                editAddress editor = new editAddress(driver, i);
                editor.editAddressesProfile();
            }

        }
        Thread.sleep(5000);
        editAddressPage editAddress = new editAddressPage(driver);
        editAddress.editInformation( "kamel", "tojani","","","","Texas","","","","","","Yes" , "Yes", "Yes");
        Thread.sleep(5000);

        detailsCheck check = new detailsCheck(driver);
        check.checkInformation("kamel", "tojani", "jerusalem", "issaweya", "palestine", "TX", "123", "canada", "26", "http://firas.com", "052-807-6374", "Yes" , "Yes", "Yes");
        Thread.sleep(5000);


        listPage listP = new listPage(driver);
        listP.getList();
        Thread.sleep(5000);

        tableCheck tableChecker = new tableCheck(driver,0);
        tableChecker.checkInformation("kamel", "tojani","palestine", "TX");


    }



    @BeforeMethod
    public void beforeMethod() {
        driver.get("http://a.testaddressbook.com/sign_in");
    }

}
