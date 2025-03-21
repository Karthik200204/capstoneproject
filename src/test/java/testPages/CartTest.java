package testPages;
import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage1;
import utilities.ReportManager;


public class CartTest extends BaseClass {
    //LoginPage loginPage;
    CartPage1 cartpage;
    //it willexecute the before test
    @BeforeMethod
    //passing the browser from xml file
    @Parameters("browser")
    public void setUp(String browser) { // Add String browser parameter
        initializeBrowser(browser);
        //loginPage = new LoginPage();
        cartpage =new CartPage1();
        ReportManager.initReport();
    }
    @Test(priority = 2)
    public void testingthecart() throws IOException {
        cartpage.ElectronicsCategory();
        screenshot();
    }
    @AfterMethod
    public void closeDownbrowser() {
        closeBrowser();
        ReportManager.flushReport();
    }
}