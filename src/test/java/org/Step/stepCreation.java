package org.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepCreation {

	private static 	WebDriver driver;
	@Given(":URL Launched")
	public void url_launched() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	
	    
	}
//	@When(": Users enter the username and password")
//	
//		public void username()
//	{
//		driver.findElement(By.id("email")).sendKeys("chithurose92@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("LOOcast1*");
//		 driver.findElement(By.name("login")).click();
//	
//	}
	



	
	
}

