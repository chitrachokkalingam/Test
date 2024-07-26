package org.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AdactSteps {
	
	private static WebDriver driver;
		
		@Given("Lunch the URL")
		public void lunch_the_url() {
        driver = new ChromeDriver();
        driver.get("http://adactinhotelapp.com/");
        driver.manage().window().maximize();
        
}

		@When("Provide the  valid {string} and {string}")
		public void provide_the_valid_and(String string, String string2) {
		   WebElement element = driver.findElement(By.name("username"));
		   element.sendKeys(string);
		   WebElement element2 = driver.findElement(By.id("password"));
		   element2.sendKeys(string2);
		}

		@Given("Provide the guest details")
		public void provide_the_guest_details() {
			System.out.println("test");
		   
		}

		@Given("check guest able to book the room")
		public void check_guest_able_to_book_the_room() {
		   System.out.println("test");
		}

		


		
		



		
	}


