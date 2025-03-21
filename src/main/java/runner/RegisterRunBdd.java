package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src\\main\\java\\feature\\Register.feature", // Path to feature files
    glue = {"stepdeff"}, // Package containing your Step Definitions
    plugin = {"pretty", "html:target/cucumber-reports", },
    tags = "@Registration"// Plugins for reporting
)
public class RegisterRunBdd extends AbstractTestNGCucumberTests {
}