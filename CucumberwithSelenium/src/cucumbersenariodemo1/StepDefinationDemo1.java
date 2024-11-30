package cucumbersenariodemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationDemo1 
{
	WebDriver driver;
	@Given("^user able to open the browser$")
	public void user_able_to_open_the_browser() throws Throwable 
	{
		System.out.println("^user able to open the browser$");
		 driver= new ChromeDriver();
	}

	@Given("^user able enter the URL$")
	public void user_able_enter_the_URL() throws Throwable 
	{
	  System.out.println("^user able enter the URL$");
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^user able to enter the username$")
	public void user_able_to_enter_the_username() throws Throwable 
	{
		System.out.println("^user able to enter the username$");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("RBG Technologies");
		
	}

	@When("^user able to enter the password$")
	public void user_able_to_enter_the_password() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("RBG Technologies123");

		System.out.println("^user able to enter the password$");
		
	}

	@When("^user able to click on submit button$")
	public void user_able_to_click_on_submit_button() throws Throwable 
	{
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

		System.out.println("^user able to click on submit button$");
		
	}

	@Then("^user able to login sucessufully$")
	public void user_able_to_login_sucessufully() throws Throwable 
	{
		System.out.println("^user able to login sucessufully$");
	}

	@Then("^user able to reach the home page$")
	public void user_able_to_reach_the_home_page() throws Throwable
	{
	System.out.println("^user able to reach the home page$");	
	}



}
