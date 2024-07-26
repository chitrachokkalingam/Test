package org.Step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleScenarioSteps {

	private static WebDriver driver;
	@Given("Lunch the Amazon website URl")
	public void lunch_the_amazon_website_u_rl() {
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
	}

	@Then("User able to login the website")
	public void user_able_to_login_the_website() {
		driver.get("https://www.amazon.in/");
	}

	@Given("Search the iphone {int}")
	public void search_the_iphone(Integer int1) throws AWTException {
	   WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
	   element.sendKeys("iphone 15 pro max");
	   Robot r1 = new Robot();
	   r1.keyPress(KeyEvent.VK_DOWN);
	   r1.keyPress(KeyEvent.VK_ENTER);
	   
	}

	@Given("Add the phone in Add to card")
	public void add_the_phone_in_add_to_card() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 15 Pro Max (256 GB)')]) [2]")).click();
	    
	}

	@When("Click the add to card")
	public void click_the_add_to_card() throws InterruptedException {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//input[@id=\"add-to-cart-button\"]) [2]")).click(); 
		String title = driver.getTitle();
		System.out.println("title");
	}

	@Given("Take the iphone screenshot")
	public void take_the_iphone_screenshot() throws IOException {
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination = new File("C:\\Users\\dhina\\OneDrive\\Documents\\Framework\\Screenshot\\iphone.jpg");
	FileUtils.copyFile(source, destination);
	
	}

	@When("check the phone")
	public void check_the_phone() {
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	}

}

