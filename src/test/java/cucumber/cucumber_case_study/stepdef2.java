package cucumber.cucumber_case_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.cucumber_case_study.utility;
import junit.framework.Assert;

public class stepdef2 {
	WebDriver driver;
	@Given("^user is in log-in page$")
	public void user_is_in_log_in_page() throws Throwable {
		 driver = utility.startBrowser("firefox", "http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("^user enters valid login credentials for lalitha and Password(\\d+)$")
	public void user_enters_valid_login_credentials_for_lalitha_and_Password(int arg1) throws Throwable {
		 driver.findElement(By.name("userName")).sendKeys("lalitha");
		  driver.findElement(By.name("password")).sendKeys("Password123");
		  driver.findElement(By.xpath("//input[@name='Login'] ")).click();
	}

	@Then("^user re-directed to Home page$")
	public void user_re_directed_to_Home_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Home");
		System.out.println("Logged in successfully");
		driver.close();
		  
	}

	@When("^user enters valid login credentials for asroopa(\\d+) and ash(\\d+)$")
	public void user_enters_valid_login_credentials_for_asroopa_and_ash(int arg1, int arg2) throws Throwable {
		 driver.findElement(By.name("userName")).sendKeys("asroopa97");
		  driver.findElement(By.name("password")).sendKeys("ash123");
		  driver.findElement(By.xpath("//input[@name='Login'] ")).click();
	}


}
