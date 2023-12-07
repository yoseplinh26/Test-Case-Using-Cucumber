package stepLoginPA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
public class SmokeTest {
	WebDriver driver;
	
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver_win32(1)\\\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
		Thread.sleep(3000);
	 
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"login-field\"]")).sendKeys(".com");
		driver.findElement(By.xpath("//*[@id=\"password-login\"]")).sendKeys("ester123");
	
	}
	
	@When("I hover over element with id password-login")
	public void hoverOverElement() {
	    WebElement element = driver.findElement(By.id("submit-login"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(element).perform();
	}

	@Then("^I can login succesfully$")
	public void I_can_login_succesfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"submit-login\"]")).click();
	   
	}

}
*/

public class SmokeTest {
	WebDriver driver;
	
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver_win32(1)\\\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
		Thread.sleep(3000);
	 
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"login-field\"]")).sendKeys("emy123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password-login\"]")).sendKeys("emy123");
	
	}
	
	@When("I hover over element with id password-login")
	public void hoverOverElement() {
	    WebElement element = driver.findElement(By.id("submit-login"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(element).perform();
	}

	@Then("^I can login succesfully$")
	public void I_can_login_succesfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"submit-login\"]")).click();
	   
	}

}

