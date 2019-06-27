package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Multiple {

	static ElementLocatorUtil utility;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		utility = new ElementLocatorUtil();
		
		
		
		driver.get("http://output.jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		
		if(utility.isMultileSelect(fruits)) {
			System.out.println("THIS IS MULTIPLE SELETION");
			//multipleSelect(driver);
			//selectMultipelValues(driver);
			driver.get("http://output.jsbin.com/osebed/2");
			WebElement element = driver.findElement(By.id("fruits"));
			UtilSelectMethod(element, "Banana", driver);
		}
	
	}
	
	
	public static void UtilSelectMethod(WebElement element, String option, WebDriver driver) {	
		Select selection = new Select(element);
		selection.selectByVisibleText(option);
	}
	

//how to select element in multi select box in selenium webdriver	
private static void selectMultipelValues(WebDriver driver) {
		String multValues =  "Banana,Apple,Orange,Grape";
		String mul[] = multValues.split(",");
		for (String value : mul) {
			System.out.println("All options are : " + mul.length);
			Select valSel = new Select(driver.findElement(By.id("fruits")));
			valSel.selectByVisibleText(value);	
		}
		
	}

	
//how tocCheck if dropdown is multiple select 	
	private static boolean isMultileSelect(WebDriver driver) {
		
		driver.get("http://output.jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		return fruits.isMultiple();
	}
	

	
	
	
private static void multipleSelect(WebDriver driver) {
		
	driver.get("http://output.jsbin.com/osebed/2");
	Select fruits = new Select(driver.findElement(By.id("fruits")));
	fruits.selectByVisibleText("Banana");
	fruits.selectByIndex(1);
	}

}
