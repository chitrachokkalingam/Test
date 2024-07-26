package BaseClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Reference {
	
	public static WebDriver driver;
	
	// 1
			public static void getDriver(String browser) {
				//WebDriverManager.chromedriver().setup();
				switch(browser)
				{
				case"browser":
				driver =new ChromeDriver();
				break;
				case "edge":
				driver = new EdgeDriver();
				
				default:
					System.out.println("default argument");
					break;
				}
				
				driver = new ChromeDriver();
				
			}
			


			// 2
			public static void enterApplnUrl(String url) {
				driver.get(url);
			}

			// 3
			public void maximizeWindow() {
				driver.manage().window().maximize();
			}

			// 4
			public void elementSendKeys(WebElement element, String data) {
				element.sendKeys(data);
			}

			// 5
//			public void elementSendKeysJs(WebElement element, String data) {
//				JavascriptExecutor executor = (JavascriptExecutor) driver;
//				executor.executeScript("arguements[0].setAttribute('value','" + data + "')", element);
	//		}

			// 6
			public void elementclick(WebElement element) {
				element.click();
			}

			// 7
			public String getWindowTitle() {
				String title = driver.getTitle();
				return title;
			}

			// 8
			public WebElement findElementById(String attributeValue) {
				WebElement element = driver.findElement(By.id(attributeValue));
				return element;
			}

			// 9
			public WebElement findElementByName(String attributeValue) {
				WebElement element = driver.findElement(By.name(attributeValue));
				return element;
			}

			// 10
			public WebElement findElementByClassName(String attributeValue) {
				WebElement element = driver.findElement(By.className(attributeValue));
				return element;
			}

			// 11
			public WebElement findElementByXpath(String attributeValue) {
				WebElement element = driver.findElement(By.xpath(attributeValue));
				return element;

}
			// 12
			public WebElement findElementByCssSelector(String attributeValue) {
				WebElement element = driver.findElement(By.cssSelector(attributeValue));
				return element;
			}

			// 13
			public WebElement findElementBylinkText(String attributeValue) {
				WebElement element = driver.findElement(By.linkText(attributeValue));
				return element;
			}

			// 14
			public WebElement findElementByPartialLinkText(String attributeValue) {
				WebElement element = driver.findElement(By.partialLinkText(attributeValue));
				return element;
			}		
		
			// 15
			public WebElement findElementByTagName(String attributeValue) {
				WebElement element = driver.findElement(By.tagName(attributeValue));
				return element;

}	
			// 16
			public void closeWindow() {
				driver.close();
			}
			
			// 17
			public void quitWindow() {
				driver.quit();
}
			
			// 18
			public String elementGetText(WebElement element) {
				String text = element.getText();
				return text;
			}
			


// 19
// 99% value --> get inserted value from textbox
public String elementGetAttributeValue(WebElement element) {
	String attribute = element.getAttribute("value");
	return attribute;
}

// 1% value --> get inserted value from textbox// without sendkeys we will pass the value
public String elementGetAttributeValue(WebElement element, String attributeName) {
	String attribute = element.getAttribute(attributeName);
	return attribute;
}

//20
		public void SelectOptionByText(WebElement element, String text) {
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}

		// 21
		public void SelectOptionByAttribute(WebElement element, String value) {
			Select select = new Select(element);
			select.selectByValue(value);
		}

			// 23
			public String getOptions(WebElement element) {
				Select select = new Select(element);
				List<WebElement> options = select.getOptions();
				WebElement webElement = options.get(5);
				String text = webElement.getText();
				return text;
}
}

