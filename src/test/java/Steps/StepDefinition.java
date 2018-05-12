package Steps;

import Util.Lib;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class StepDefinition extends Lib {

    WebDriver driver;

    @Before
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "D:\\Google Drive\\PIIT\\IntellijCodes\\CucumberDemoqa\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Given("^i am on homepage$")
    public void homepg() throws InterruptedException{
        String home = getTitle(driver);
        System.out.println("Title: " + home);
        Thread.sleep(1000);
    }

    @Then("^i click registeration$")
    public void register() throws IOException, InterruptedException {
        WebElement register = findElem(driver, readProperty("register"));
        register.click();
        Thread.sleep(1000);
    }

    @Given("^i go back to previous window$")
    public void goBack()throws InterruptedException{
        driver.navigate().back();
        Thread.sleep(1000);
    }

    @After
    public void teardown(){
        System.out.println("Testing is complete");
        driver.close();
    }
}
