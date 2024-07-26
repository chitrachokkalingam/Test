package org.Step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.text.DefaultEditorKit.CopyAction;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps {

	private static WebDriver driver;
	@Given("URL Launched")
	public void url_launched() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	@When("Order the Phone")
	public void order_the_phone() throws AWTException, InterruptedException {
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("sumsung s23");
		Thread.sleep(1000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		
	    
	}
	@When("Select the Phone")
	public void select_the_phone() throws InterruptedException  {
		WebElement element = driver.findElement(By.xpath("(//span[contains(text(),'Galaxy S23 5G ')]) [1]"));
		element.click();
		Thread.sleep(1000);
		
		JavascriptExecutor scrolldown =(JavascriptExecutor) driver;
		scrolldown.executeScript("window.scrollBy(0,1500)");
	}
	@Then("Click Add to Card")
	public void click_add_to_card() throws InterruptedException  {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='buy-now-button'] )")).click(); 
		
	}
	@Then("Proceed the payment")
	public void proceed_the_payment() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\dhina\\OneDrive\\Documents\\Framework\\Screenshot\\phone.jpg");
	FileUtils.copyFile(source, destination);
	}


}

