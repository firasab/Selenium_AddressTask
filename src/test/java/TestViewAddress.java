import core.OpenBrowsers;
import core.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.*;


public class TestViewAddress {
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = OpenBrowsers.openBrowser("chrome");
        driver.manage().window().maximize();
    }




    @Test
    public void secondTest() throws InterruptedException {

        loginPage resPage = new loginPage(driver);
        String SearchedName = "firas";

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


        String title = driver.getTitle();
        System.out.println(title);

        String url = driver.getCurrentUrl();
        System.out.println(url);



        for ( int i = 0; i<rowsNumber; i++) {

            //get the value of the First Name cells
            String name = dataTable.getCellValue(i, "First name");


            System.out.println("the wanted name is " + SearchedName);
            System.out.println("the found name " + name);

            //check if the name is same - if its samer then open his profile
            int checker = name.compareTo(SearchedName);
            if (checker == 0) {

                viewAddress viewer = new viewAddress(driver , i);
                viewer.getAddressesProfile();
            }
        }

        Thread.sleep(5000);
        listPage listP = new listPage(driver);
        listP.getList();
        Thread.sleep(5000);

    }


    @BeforeMethod
    public void beforeMethod() {
        driver.get("http://a.testaddressbook.com/sign_in");
    }

}
