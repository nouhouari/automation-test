package com.hin.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hin.test.pages.HomePage;
import com.hin.test.utils.TestUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoTest {

	private static final String driverPropertyName = "webdriver.chome.driver";
	private static final String chromeDriverPath = "/usr/local/bin/chromedriver";
	private WebDriver driver;
	private HomePage homePage;
	
	public DemoTest() {
		System.setProperty(driverPropertyName, chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
	}  
	
	@Given("User is on Home page")
	public void user_is_on_home_page() {
		homePage.goToPage();
	}
	
	@When("User enters username as {string}")
	public void user_enters_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    ///throw new io.cucumber.java.PendingException();
//		WebElement queryField = driver.findElement(By.name("q"));
//		queryField.sendKeys("Hello");
//		queryField.sendKeys(Keys.ENTER);
//		try {
//			TestUtils.takeSnapShot(driver);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
	}
	
	@Then("User should be able to login sucessfully")
	public void user_should_be_able_to_login_sucessfully() {
		homePage.goToStore();
		try {
			TestUtils.takeSnapShot(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
