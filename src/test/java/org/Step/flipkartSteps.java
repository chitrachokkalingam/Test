package org.Step;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import BaseClass.Reference;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flipkartSteps {
	private static WebDriver driver;
	
	@Given("flipkart URL Launched")
	public void flipkart_url_launched() {
		 driver= new ChromeDriver();
		 driver.get("https://www.instagram.com/accounts/login/");
		 driver.manage().window().maximize();
	    
	}
	@When("Provide Username Password")
	public void provide_username_password() throws IOException, InterruptedException {
		File f1 = new File("C:\\Users\\dhina\\eclipse-workspace\\cucumber\\Exceldata\\instagram1.xlsx");
	    FileInputStream fileInputStream = new FileInputStream(f1);
	    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
	    XSSFSheet sheet = workbook.getSheet("Sheet1");
	    for(int i =0;i<sheet.getPhysicalNumberOfRows();i++)
	    {
	    	XSSFRow row = sheet.getRow(i);
	    	XSSFCell cell = row.getCell(0);
	    	String stringCellValue = cell.getStringCellValue();
	   driver.findElement(By.name("username")).sendKeys(stringCellValue);
	   
	   XSSFRow row2 = sheet.getRow(i);
	   XSSFCell cell2 = row2.getCell(1);
	   String stringCellValue2 = cell2.getStringCellValue();
	   driver.findElement(By.name("password")).sendKeys(stringCellValue2);
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//div[text()='Log in']")).click();
	    
	   Thread.sleep(1000);
	    }  
	    
	}
	
	@When("Search the phone")
	public void search_the_phone() throws InterruptedException {
		Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"mount_0_0_wC\"]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div[1]/div/span/div/a/div")).click();
	  
	}
	@Then("Click add to card")
	public void click_add_to_card() {
	   System.out.println("text");
	}
	@Then("Oeder the phone")
	public void oeder_the_phone() {
		System.out.println("text1");
	}
	@Then("Provide the Payment details")
	public void provide_the_payment_details() {
		System.out.println("text2");
	}


}
