package pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	    public By secondproduct = By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]");
	    
	    public By shoppingcart =By.linkText("Shopping cart");
	    public By termsCheckbox = By.id("termsofservice");
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
        driver.findElement(secondproduct).click();
        System.out.println("added to cart successful");
        Thread.sleep(3000);
        driver.findElement(shoppingcart).click();
        System.out.println("successfully entered into cart");
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(termsCheckbox));
        checkbox.click();
        System.out.println("clicked on checkbox");
	}
	
}
