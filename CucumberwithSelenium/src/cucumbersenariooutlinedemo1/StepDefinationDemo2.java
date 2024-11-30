package cucumbersenariooutlinedemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationDemo2
{
	WebDriver driver;
	
	@Given("^I want to write a step with \"([^\"]*)\"$")
	public void I_want_to_write_a_step_with(String username) throws Throwable 
	{
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement userid= driver.findElement(By.xpath("//input[@name='username']"));
	userid.sendKeys("RBG Technologies");
		
		System.out.println("username : "+username);
	}

	@When("^I check for the \"([^\"]*)\" in step$")
	public void I_check_for_the_in_step(String password) throws Throwable 
	{
		WebElement passwd= driver.findElement(By.xpath("//input[@type='password']"));
		passwd.sendKeys("RBG Technologies123");

		System.out.println("password : "+password);

	}

	@Then("^I verify the \"([^\"]*)\" in step$")
	public void I_verify_the_in_step(String status) throws Throwable 
	{
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		System.out.println("status : "+status);

	}



}
