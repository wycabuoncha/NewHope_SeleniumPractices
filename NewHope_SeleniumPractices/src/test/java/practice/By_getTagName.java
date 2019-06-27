package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//https://www.programcreek.com/java-api-examples/?class=org.openqa.selenium.WebElement&method=getTagName
public class By_getTagName {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.id("email")).getTagName());
		
		String country = "ALBANIA";
		String result =  myCountrySelection(country, driver);
		System.out.println(result);
		
		driver.quit();
	}

	private static String myCountrySelection(String country, WebDriver _driver) {
		
		WebElement element = _driver.findElement(By.name("country"));
		String tagName = element.getTagName();
		
		if (tagName.equals("select")) {
			return "PASS";
		}
		return "FAIL";
	}

}

//country