package pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.BaseClass;
import utilities.ConfigReader;
public class CartPage extends BaseClass {
	 ConfigReader config = new ConfigReader();
	 //WebDriver driver;  
	    WebDriverWait wait;  
	    public By loginLink = By.linkText("Log in");
	    public By emailField = By.id("Email");
	    public By passwordField = By.id("Password");
	    public By loginButton = By.cssSelector("input.button-1.login-button");
	    public By Electronics = By.linkText("Electronics");
	    public By cellphone = By.linkText("Cell phones");
	    public By firstproduct = By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]");
	    //public By secondproduct = By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]");
	    
	    public By shoppingcart =By.linkText("Shopping cart");
	    
	    public By deleteCheckbox = By.xpath("//input[@name='removefromcart']");
	    public By updatecart = By.xpath("//input[@name='updatecart']");
	    public By searchproduct=By.xpath("//input[@type='text']");
	    
	    public By Electronic = By.linkText("Electronics");
	    public By cellphones = By.linkText("Cell phones");
	    public By firstproducts = By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]");
	    public By shoppingcarts =By.linkText("Shopping cart");
	    public By quantity =By.xpath("(//input[@type='text'])[2]");
	    public By updatecart1 = By.xpath("//input[@name='updatecart']");
	    public By termsCheckbox = By.id("termsofservice");
	    public By checkout = By.xpath("//button[@id='checkout']");
	   
	    public By selectAddressDropDown = By.xpath("//select[@id='billing-address-select']");
	    public By company = By.xpath("//input[@id='BillingNewAddress_Company']");
	    public By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
	    public By city = By.xpath("//input[@id='BillingNewAddress_City']");
	    public By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
	    public By pincode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
	    public By mobile = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
	    public By continue1 = By.xpath("(//input[@type='button'])[2]");
	    public By continue2 = By.xpath("(//input[@type='button'])[3]");
	    public By continue3 = By.xpath("(//input[@type='button'])[4]");
	    public By continue4 = By.xpath("(//input[@type='button'])[5]");
	    public By continue5 = By.xpath("(//input[@type='button'])[6]");
	    public By continue6 = By.xpath("(//input[@type='button'])[7]");
	    public By continue7 = By.xpath("(//input[@type='button'])");
	    public By account = By.xpath("(//a[@class='account'])[1]");
	    public By orders = By.xpath("(//a[@class='inactive'])[2]");
	    public By details = By.cssSelector("input[type='button']");
	    //public By secondproducts = By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]");
	    		public CartPage() {
	        //this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  
	    }
	public void ElectronicsCategory() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(loginLink).click();
        driver.findElement(emailField).sendKeys(config.getProperty("email"));
        driver.findElement(passwordField).sendKeys(config.getProperty("password"));
        driver.findElement(loginButton).click();
        System.out.println("login successful");
        driver.findElement(Electronics).click();
        driver.findElement(cellphone).click();
        driver.findElement(firstproduct).click();
        //driver.findElement(secondproduct).click();
        System.out.println("added to cart successful");
        Thread.sleep(3000);
        driver.findElement(shoppingcart).click();
        System.out.println("successfully entered into cart");
        
        driver.findElement(deleteCheckbox).click();
        driver.findElement(updatecart).click();
        driver.findElement(searchproduct).click();
        driver.findElement(searchproduct).sendKeys("electronics",Keys.ENTER);
        driver.findElement(Electronic).click();
        driver.findElement(cellphones).click();
        driver.findElement(firstproducts).click();
        //driver.findElement(secondproducts).click();
        System.out.println("added to cart successful");
        driver.findElement(shoppingcarts).click();
        driver.findElement(quantity).click();
        driver.findElement(quantity).clear();
        driver.findElement(quantity).sendKeys("3",Keys.ENTER);
        driver.findElement(updatecart1).click();
        
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(termsCheckbox));
        checkbox.click();
        System.out.println("clicked on checkbox");
        driver.findElement(checkout).click();
        
        Select select = new Select(driver.findElement(selectAddressDropDown));
	    select.selectByVisibleText("New Address");
        driver.findElement(company).sendKeys(config.getProperty("company"));
        driver.findElement(country).click();
        driver.findElement(country).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
        driver.findElement(country).click();
        driver.findElement(city).sendKeys(config.getProperty("City"));
        driver.findElement(address).sendKeys(config.getProperty("Address"));
        driver.findElement(pincode).sendKeys(config.getProperty("Pincode"));
        driver.findElement(mobile).sendKeys(config.getProperty("Mobile"));
        driver.findElement(continue1).click();
        Thread.sleep(2000);
        driver.findElement(continue2).click();
        Thread.sleep(2000);
        driver.findElement(continue3).click();
        Thread.sleep(2000);
        driver.findElement(continue4).click();
        Thread.sleep(2000);
        driver.findElement(continue5).click();
        Thread.sleep(2000);
        driver.findElement(continue6).click();
        Thread.sleep(3000);
        driver.findElement(continue7).click();
        Thread.sleep(3000);
        driver.findElement(account).click();
        Thread.sleep(3000);
        driver.findElement(orders).click();
        Thread.sleep(3000);
        WebElement detailsElement = wait.until(ExpectedConditions.elementToBeClickable(details));
        detailsElement.click();

	}
	
}
