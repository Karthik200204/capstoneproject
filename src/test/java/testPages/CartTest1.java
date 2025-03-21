package testPages;
import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;
import utilities.ReportManager;


public class CartTest1 extends BaseClass {
    //LoginPage loginPage;
    CartPage cartpage;
    //it willexecute the before test
    @BeforeMethod
    //passing the browser from xml file
    @Parameters("browser")
    public void setUp(String browser) { // Add String browser parameter
        initializeBrowser(browser);
        //loginPage = new LoginPage();
        cartpage =new CartPage();
        ReportManager.initReport();
    }
    @Test(priority = 2)
    public void testingthecart() throws IOException, InterruptedException {
        cartpage.ElectronicsCategory();
        screenshot();
    }
    @AfterMethod
    public void closeDownbrowser() {
        closeBrowser();
        ReportManager.flushReport();
    }
}