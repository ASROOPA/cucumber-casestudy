package cucumber.cucumber_case_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.cucumber_case_study.utility;
import junit.framework.Assert;


public class stepdef1 {
	WebDriver driver;
	Select sel;
	@Given("^user enters sign-up page$")
	public void user_enters_sign_up_page() throws Throwable {
		 driver = utility.startBrowser("firefox", "http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	}

	@When("^user enters valid user name as \"([^\"]*)\"$")
	public void user_enters_valid_user_name_as(String arg1) throws Throwable {
	  //driver.findElement(By.name("userName")).click();
	  driver.findElement(By.id("userName")).sendKeys("asroopa1997");
	}

	@When("^user enters First name as \"([^\"]*)\"$")
	public void user_enters_First_name_as(String arg1) throws Throwable {
		driver.findElement(By.id("firstName")).sendKeys("Asroopa");
	}

	@When("^user enters Last name as \"([^\"]*)\"$")
	public void user_enters_Last_name_as(String arg1) throws Throwable {
		driver.findElement(By.id("lastName")).sendKeys("Basini");
	}

	@When("^user enters Password as \"([^\"]*)\"$")
	public void user_enters_Password_as(String arg1) throws Throwable {
		driver.findElement(By.id("password")).sendKeys("ash123");
	}

	@When("^user enters confirm password as \"([^\"]*)\"$")
	public void user_enters_confirm_password_as(String arg1) throws Throwable {
		 driver.findElement(By.name("confirmPassword")).sendKeys("ash123");
	}

	@When("^user clicks gender as \"([^\"]*)\"$")
	public void user_clicks_gender_as(String arg1) throws Throwable {
		  driver.findElement(By.xpath("//input[@type='radio' and @value='Female'] ")).click();
	}

	@When("^user enters email as \"([^\"]*)\"$")
	public void user_enters_email_as(String arg1) throws Throwable {
		driver.findElement(By.id("emailAddress")).sendKeys("asroopab@gmail.com");
	}

	@When("^user enters mobile number as \"([^\"]*)\"$")
	public void user_enters_mobile_number_as(String arg1) throws Throwable {
		driver.findElement(By.id("mobileNumber")).sendKeys("8838309039");
	}

	@When("^user enters dob as \"([^\"]*)\"$")
	public void user_enters_dob_as(String arg1) throws Throwable {
		driver.findElement(By.name("dob")).sendKeys("31/12/1997");
	}

	@When("^user enters address as \"([^\"]*)\"$")
	public void user_enters_address_as(String arg1) throws Throwable {
		driver.findElement(By.id("address")).sendKeys("Coimbatore");
	}

	@When("^user selects security questions as \"([^\"]*)\"$")
	public void user_selects_security_questions_as(String arg1) throws Throwable {
		sel=new Select (driver.findElement(By.name("securityQuestion")));
		  sel.selectByIndex(1);
	}

	@When("^user enters answers as \"([^\"]*)\"$")
	public void user_enters_answers_as(String arg1) throws Throwable {
		 driver.findElement(By.name("answer")).sendKeys("blue");
	}
	
	@When("^user clicks enter button$")
	public void user_clicks_enter_button() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit'] ")).click();
	}

	@Then("^user re-directed to login page$")
	public void user_re_directed_to_login_page() throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Login")));
		Assert.assertEquals(driver.getTitle(), "Login");
		System.out.println("Signed in Successfully !!");
		driver.close();
	}

}
