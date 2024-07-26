package org.Step;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import BaseClass.Reference;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookSteps extends Reference  {
	private static WebDriver driver;
	
	@Given("Launch the facebook URL")
	public void launch_the_facebook_url() {
		 driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/"); 
	}

	@Then("Provide user details")
	public void provide_user_details() throws InterruptedException  {
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 Thread.sleep(1000);

	}

	@Then("Sign Up")
	public void sign_up() throws Exception {
		
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("(//input[@name='firstname']) [1]"));
		element.sendKeys("chitraa");
		WebElement element2 = driver.findElement(By.xpath("(//input[@name='lastname']) [1]"));
		element2.sendKeys("chokkalingamm");
		WebElement element3 = driver.findElement(By.xpath("(//input[@name='reg_email__']) [1]"));
		element3.sendKeys("8610451628");
	    WebElement element4 = driver.findElement(By.id("password_step_input"));
	    element4.sendKeys("Welcome1*");
	    Thread.sleep(1000);
	    WebElement element5 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	    Select fb = new Select(element5);
	    fb.selectByValue("28");
	    Thread.sleep(1000);
	    WebElement element6 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	    Select month1 = new Select(element6) ;
	    month1.selectByValue("5");
	     WebElement element7 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	     Select year = new Select(element7);
	     year.selectByValue("1992");
	     driver.findElement(By.xpath("//input[@name='sex']")).click();
	     driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	     
	
	}

	@Given("Launch the facebook1 URL")
	public void launch_the_facebook1_url() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    
	}
	
	@When("Enter the username and password with 1D")
	public void enter_the_username_and_password_with_1d(io.cucumber.datatable.DataTable dataTable) {
	  List<String> asList = dataTable.asList();
  String string = asList.get(0);
  String string2 = asList.get(1);
  WebElement element = driver.findElement(By.id("email"));
  element.sendKeys(string);
  WebElement element1 = driver.findElement(By.id("pass"));
  element1.sendKeys(string2);
  }
	
	@Given("lunch the instagram page")
	public void lunch_the_instagram_page() throws InterruptedException {
		Thread.sleep(1000);
		
		driver.get("https://www.facebook.com/");
	}
	   
	
	@When("Users enter the Valid credentials {string} and {string} for user login")
	public void users_enter_the_valid_credentials_and_for_user_login(String string, String string2) {
			WebElement user = driver.findElement(By.id("email"));
			elementSendKeys(user, string);	
		
	}

	@When("Click the Login button")
	public void click_the_login_button(io.cucumber.datatable.DataTable dataTable) {
	System.out.println("login");
	}



}



	
