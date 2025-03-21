package pages;
import base.BaseClass;
import utilities.ConfigReader;
import utilities.ReportManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
public class CartPage1 extends BaseClass {
	//reading data from properties file
    ConfigReader config = new ConfigReader();
    //registering purpose
    public By registerLink = By.linkText("Register");
    public By genderMale = By.id("gender-male");
    public By firstNameField = By.id("FirstName");
    public By lastNameField = By.id("LastName");
    public By emailField1 = By.id("Email");
    public By passwordField1 = By.id("Password");
    public By confirmPasswordField = By.id("ConfirmPassword");
    public By registerButton = By.id("register-button");
    public By errorMessage = By.xpath("//li[normalize-space()='The specified email already exists']");
   //login purpose
    public By loginLink = By.linkText("Log in");
    public By emailField = By.id("Email");
    public By passwordField = By.id("Password");
    public By loginButton = By.cssSelector("input.button-1.login-button");
    public By Electronics = By.linkText("Electronics");
    public By cellphone = By.linkText("Cell phones");
    public By firstproduct = By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]");
    public By secondproduct = By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]");
    public By shoppingcart = By.linkText("Shopping cart");
    public void ElectronicsCategory() {
    	
    	
         // Starting the report for extent report
        try {
        	ReportManager.createTest("Registering");
        	driver.findElement(registerLink).click();
        	ReportManager.getTest().pass(" click register Successful");
            driver.findElement(genderMale).click();
            ReportManager.getTest().pass(" gender Successful");
            driver.findElement(firstNameField).sendKeys(config.getProperty("firstname"));
            ReportManager.getTest().pass(" firsrtname entered Successful");
            driver.findElement(lastNameField).sendKeys(config.getProperty("lastname"));
            ReportManager.getTest().pass(" Lastname entered Successful");
            driver.findElement(emailField1).sendKeys(config.getProperty("email"));
            ReportManager.getTest().pass(" email entered Successful");
            driver.findElement(passwordField1).sendKeys(config.getProperty("password"));
            ReportManager.getTest().pass(" password entered Successful");
            driver.findElement(confirmPasswordField).sendKeys(config.getProperty("password"));
            ReportManager.getTest().pass(" confirm password entered Successful");
            driver.findElement(registerButton).click();
            ReportManager.getTest().pass(" clicked on register Successful");
            System.out.println("successfully registerd");
        	ReportManager.createTest("log in");
            driver.findElement(loginLink).click();
            ReportManager.getTest().log(Status.INFO, "Clicked on Login link");
            driver.findElement(emailField).sendKeys(config.getProperty("email"));
            ReportManager.getTest().log(Status.INFO, "Entered Email");
            driver.findElement(passwordField).sendKeys(config.getProperty("password"));
            ReportManager.getTest().log(Status.INFO, "Entered Password");
            driver.findElement(loginButton).click();
            ReportManager.getTest().pass(" Login Successful");
            ReportManager.createTest("Add Electronics to Cart");
            driver.findElement(Electronics).click();
            ReportManager.getTest().log(Status.INFO, "Navigated to Electronics Category");
            driver.findElement(cellphone).click();
            ReportManager.getTest().log(Status.INFO, "Selected 'Cell Phones' Category");
            driver.findElement(firstproduct).click();
            ReportManager.getTest().pass(" First Product Added to Cart");
            driver.findElement(secondproduct).click();
            ReportManager.getTest().pass("Second Product Added to Cart");
            driver.findElement(shoppingcart).click();
            ReportManager.getTest().pass("Successfully Entered Shopping Cart");
        } 
        //if try fail it gives an test failed message in catch
        catch (Exception e) {
            ReportManager.getTest().fail(" Test Failed: " + e.getMessage());
        }
    }
}
