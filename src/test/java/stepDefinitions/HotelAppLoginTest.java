package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelAppLoginTest {
	WebDriver driver;
	String expectedoutput="Hello JMamatha123!";
	
	
	@Given("I am on login page")
	public void i_am_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://adactinhotelapp.com/index.php");
		System.out.println("adding a newline");
		
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("username")).sendKeys(string);
	}

	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("login")).click();
	}

	@Then("the login was successful")
	public void the_login_was_successful() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		String Actualgreeting=driver.findElement(By.id("username_show")).getAttribute("value");
		Assert.assertEquals(expectedoutput,Actualgreeting);
	}




}
