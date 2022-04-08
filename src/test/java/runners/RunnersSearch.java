package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utils.Browsers;
import utils.Driver;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefs"},
        dryRun = false
)


public class RunnersSearch extends AbstractTestNGCucumberTests {

    @BeforeTest
    @Parameters("browser")
    public void beforeTest(String browser){
        if (browser.equalsIgnoreCase("firefox")){
            Driver.browserNames.set(Browsers.FIREFOX);
        } else {
            Driver.browserNames.set(Browsers.CHROME);
        }
    }


    @AfterSuite
    public void afterSuite(){
        Driver.quitDriver();
    }
}
