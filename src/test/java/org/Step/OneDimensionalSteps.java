package org.Step;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import BaseClass.Reference;

public class OneDimensionalSteps extends Reference {
	private static WebDriver driver;
	
	@Given("User is on facebook login page")
	public void user_is_on_facebook_login_page() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	   
	}
	@When("Users enters the valid credntials {string} and {string} for user login")
	public void users_enters_the_valid_credntials_and_for_user_login(String string, String string2) {
		WebElement user = driver.findElement(By.id("email"));
		elementSendKeys(user, string);
		
	   
	}
	@When("User Click the Login button")
	public void user_click_the_login_button() {
	   System.out.println("test");

}
	@Given("Login the instagram page")
	public void login_the_instagram_page() {
		driver.get("https://www.facebook.com/");
	    
	}
	@When("Users enter the valid credntials {string} and {string}  for user login")
	public void users_enter_the_valid_credntials_and_for_user_login(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String, String>> asMaps = dataTable.asMaps();
	 driver.findElement(By.id("email")).sendKeys(asMaps.get(0).get("username"));
	 driver.findElement(By.id("pass")).sendKeys(asMaps.get(1).get("Password"));
	    
	}

}

