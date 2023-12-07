package StepDefinition;
import org.openqa.selenium.Dimension;

import java.io.Serializable;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

	/* -- Register Test */

//WebDriver driver;
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//	
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/register");		 
//
//	}
//
//	@When("^I enter valid namalengkap alamat username nohp email and password$")
//	public void I_enter_valid_namalengkap_alamat_username_nohp_email_and__password() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/div/div[1]/div/input")).sendKeys("-"); //nama
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/div/div[2]/div/input")).sendKeys("Ja"); //alamat
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/div/div[3]/div/input")).sendKeys("s");//username
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/div/div[4]/div/input")).sendKeys("-");//nohp
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/div/div[5]/div/input")).sendKeys("baya");//email
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/div/div[6]/div/input")).sendKeys("el");//password
//	}
//
//	// Scroll to the element before clicking it
//	public void scrollElementToBottom(WebElement element) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element);
//    }
//
//	@Then("^I click the submit button$")
//	public void I_click_the_submit_button() throws Throwable {
//		Thread.sleep(20000); // Delay of 2 seconds
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/form/button")).click();
//}
//}
	WebDriver driver;
@Given("^open chrome and start application$")
public void open_chrome_and_start_application() throws Throwable {

	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1:8000/login");	
		
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
	}

	@Then("^I can login succesfully$")
	public void I_can_login_succesfully() throws Throwable {
		driver.findElement(By.xpath("//*html/body/div[4]/div/div/form/button")).click();

	}

	@And("^I click menu table$")
	public void I_click_menu_tabel() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a/span")).click();

	}

	@And("^I click button tambah$")
	public void I_click_button_tambah() throws Throwable {

		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div[1]/span/a")).click();
	}

	@And("^I enter valid nama$")
	public void I_enter_valid_nama() throws Throwable {
		driver.findElement(By.id("name")).sendKeys("Alat Pemangkas");
		
	}

	@And ("^I enter valid nomor meja$")
	public void I_enter_valid_nomor_meja() throws Throwable {
		driver.findElement(By.id("no_meja")).sendKeys("2");
	}
	@And ("^I enter valid deskripsi$")
	public void I_enter_valid_deskripsi() throws Throwable {
		driver.findElement(By.id("description")).sendKeys("2");
	}
	@Then("^I can tambah barang succesfully$")
	public void I_can_tambah_barang_succesfully() throws Throwable {
		driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div[2]/form/button")).click();
	}
	
}