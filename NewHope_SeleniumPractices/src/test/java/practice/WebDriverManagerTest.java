package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) {
		new WebDriverManagerTest().testDriverManagerChrome();

	}

	private String url = "http://demo.guru99.com/test/newtours/";

	private void testDriverManagerChrome() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		String actualTitle = "Welcome: Mercury Tours";
		driver.get(url );
		driver.manage().window().fullscreen();
		
		 if(actualTitle.contentEquals(driver.getTitle())) {
			 System.out.println("PASSED");
		 }else {
			System.out.println("FAILED");
		}
		
		driver.quit();
		
	}

}
