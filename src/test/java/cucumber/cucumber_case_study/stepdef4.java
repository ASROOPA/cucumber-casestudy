package cucumber.cucumber_case_study;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.cucumber_case_study.utility;
import junit.framework.Assert;

public class stepdef4 {
	WebDriver driver;

	@Given("^Alex logged in and clicks the search button$")
	public void alex_logged_in_and_clicks_the_search_button() throws Throwable {
		driver = utility.startBrowser("firefox", "http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@name='Login'] ")).click();
	}

	@When("^Alex enters available product name's four letter$")
	public void alex_enters_available_product_name_s_four_letter() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myInput")));
		driver.findElement(By.id("myInput")).click();
		WebElement d = driver.findElement(By.xpath("//input[@id='myInput' and @name='products']"));
		d.sendKeys(new String[] { "head" });
	}

	@When("^selects the product from the list and clicks search button$")
	public void selects_the_product_from_the_list_and_clicks_search_button() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit' and @name='val']")).click();
	}

	@Then("^Alex redirected to the product page$")
	public void alex_redirected_to_the_product_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("Search"));
		driver.findElement(By.xpath("//input[@type='submit' and @name='val']")).click();
		String text = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/h3")).getText();
		String temp1 = "Sorry no products available in this category. Please try some other";
		if (text.equals(temp1)) {
			System.out.println("unsuccessful");
			driver.close();
		}
		else {
			System.out.println("successful");
			driver.close();
		}
	}

	@Given("^Alex logged in and clicks search button$")
	public void alex_logged_in_and_clicks_search_button() throws Throwable {
		driver = utility.startBrowser("firefox", "http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@name='Login'] ")).click();
	}

	@When("^Alex enters non-available product name's four letter$")
	public void alex_enters_non_available_product_name_s_four_letter() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myInput")));
		driver.findElement(By.id("myInput")).click();
		WebElement d = driver.findElement(By.xpath("//input[@id='myInput' and @name='products']"));
		d.sendKeys(new String[] { "abcd" });
	}

	@Then("^no products found will be displayed$")
	public void no_products_found_will_be_displayed() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit' and @name='val']")).click();
		String text = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/h3")).getText();
		String temp = "Sorry no products available in this category. Please try some other";
		if (text.equals(temp)) {
			System.out.println("successful");
			driver.close();
		} else {
			System.out.println("unsuccessful");
			driver.close();
		}
	}

	@Given("^alex logged in$")
	public void alex_logged_in() throws Throwable {
		driver = utility.startBrowser("firefox", "http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@name='Login'] ")).click();
	}

	@When("^alex searches headphones$")
	public void alex_searches_headphones() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myInput")));
		driver.findElement(By.id("myInput")).click();
		WebElement d = driver.findElement(By.xpath("//input[@id='myInput' and @name='products']"));
		d.sendKeys(new String[] { "head" });
	}

	@When("^try to proceed to purchase$")
	public void try_to_proceed_to_purchase() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit' and @name='val']")).click();
	}

	@Then("^purchase is disable as no items added to cart$")
	public void purchase_is_disable_as_no_items_added_to_cart() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("View Cart"));
		Assert.assertEquals(driver.getTitle(), "View Cart");
		driver.close();
	}

}
