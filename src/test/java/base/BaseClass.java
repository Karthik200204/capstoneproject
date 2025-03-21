package base;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.google.common.io.Files;
import utilities.ConfigReader;

public class BaseClass {
    public static WebDriver driver;
    public static ConfigReader config = new ConfigReader();

    public static void initializeBrowser(String browser) { // Modified to accept browser as a parameter
        String url = config.getProperty("url"); // Reading URL from properties
         //using the browser to implement
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Invalid browser specified: " + browser);
        }

        driver.manage().window().maximize();
        //implicitwait is used for the whole page at a time to respond
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }

    public static void screenshot() throws IOException {
        // Take the screenshot as proof
        File src = null;
        src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(src, new File("./screenshots/" + "page-" + System.currentTimeMillis() + ".png"));
    }
//this is for the taking the screenshot
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}