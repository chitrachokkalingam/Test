package org.Step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


public class RedBusSteps {
	private static WebDriver driver;
	
	@Given("Launch the RedBus URL")
	public void launch_the_red_bus_url() {
		 driver = new ChromeDriver();
	    driver.get("https://www.redbus.in/");
	    driver.manage().window().maximize();
//	    Alert alert = driver.switchTo().alert();
//	    alert.accept();
	}
	@When("provide the source ,destination and date")
	public void provide_the_source_destination_and_date() throws InterruptedException, AWTException {
		
		Thread.sleep(1000);
		 WebElement element = driver.findElement(By.xpath("//div[contains(@class,'sc-ifAKCX kPhbmx')]"));
		WebElement element2 = driver.findElement(By.xpath("//INPUT[@ID='src']"));
		element2.sendKeys("chennai");
		Thread.sleep(1000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		WebElement element3 = driver.findElement(By.xpath("//INPUT[@ID='dest']"));
		element3.sendKeys("Trichy");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		WebElement element4 = driver.findElement(By.xpath("//div[@class='labelCalendarContainer']"));
		element4.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='dateText']")).click();
		WebElement element5 = driver.findElement(By.xpath("//*[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1]"));
		element5.click();
		Thread.sleep(2000);
		
		
		
	}
	@When("Search the bus")
	public void search_the_bus() {
	    
	}
	@When("Select the bus and book the ticket")
	public void select_the_bus_and_book_the_ticket() {
	   
		
	}
}


	
	