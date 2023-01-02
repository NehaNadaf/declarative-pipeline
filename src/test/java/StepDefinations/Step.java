package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

 

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class Step{
    static WebDriver driver = null;
    @Given("^I am on Github home page$")
    public void i_am_on_Github_home_page(){
        String site = "https://www.github.com/login";
//        System.setProperty("webdriver.chrome.driver", "Executables\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(site);;
}

    @When("^I specify Username and Password$")
    public void i_specify_Username_and_Password() {
        driver.findElement(By.cssSelector("input#login_field")).sendKeys("NehaNadaf");
        driver.findElement(By.cssSelector("input#password")).sendKeys("Neha1720");;
    }

 

    @When("^Click on SignIn button$")
    public void click_on_SignIn_button(){
        driver.findElement(By.cssSelector("input.btn")).click();;
    }

 

    @Then("^I should be able to see logout option$")
    public void I_should_be_able_to_see_logout_option() throws InterruptedException{
    }
}
