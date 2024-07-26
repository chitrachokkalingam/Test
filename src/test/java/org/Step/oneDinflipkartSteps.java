package org.Step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import BaseClass.Reference;
 

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class oneDinflipkartSteps extends Reference{
	private static WebDriver driver;
	

	@Given("checking facebook login using {string} browser")
	public void checking_facebook_login_using_browser(String string) {
	   getDriver(string);
	   enterApplnUrl("https://www.facebook.com/");
	}

		    
	
	
   @When("User enters the credentials Using 1D Database with heading")
	public void user_enters_the_credentials_using_1d_database_with_heading(io.cucumber.datatable.DataTable dataTable) {
	 Map<String, String> asMap = dataTable.asMap(); 
	 String string = asMap.get("username2");
	 String string2 = asMap.get("password2");
	 WebElement elementById = findElementById("email");
	 elementSendKeys(elementById, string);
	 WebElement elementById2 = findElementById("pass");
	 elementSendKeys(elementById2, string2);  
	      
	}

   @When("User enters the credentials Using 2D Database without heading")
   public void user_enters_the_credentials_using_2d_database_without_heading(io.cucumber.datatable.DataTable dataTable) {
      List<List<String>> asLists = dataTable.asLists();
      List<String> list = asLists.get(0);
      String string = list.get(0);
      WebElement elementById = findElementById("email");
      elementSendKeys(elementById,string);
      List<String> list2 = asLists.get(1);
      String string2 = list2.get(1);
      WebElement elementById2 = findElementById("pass");
      elementSendKeys(elementById2, string2);
   }

   @When("User enters the {string} credentials {string} and {string}  for user login")
   public void user_enters_the_credentials_and_for_user_login(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
   List<List<String>> asLists = dataTable.asLists();
   System.out.println(string);
   List<String> list = asLists.get(1);
   String string4 = list.get(0);
   WebElement elementById3 = findElementById("email");
   elementSendKeys(elementById3, string4);
   List<String> list4 = asLists.get(1);
   String string5 = list.get(1);
   WebElement elementById4 = findElementById("pass");
   elementSendKeys(elementById4, string5);
   
   }
   
   
   @Given("checking the username and password")
   public void checking_the_username_and_password() {
	   driver.get("https://www.facebook.com/");
       
   }

   @When("Enters the {string} and {string}> for user login")
   public void enters_the_and_password_for_user_login(String string, io.cucumber.datatable.DataTable dataTable) {
      List<Map<String, String>> asMaps = dataTable.asMaps();
      driver.findElement(By.id("email")).sendKeys(asMaps.get(1).get("username"));
	   
   }
   

}
