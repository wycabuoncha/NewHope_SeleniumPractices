package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementLocatorUtil {

	public static void UtilSelectMethod(WebElement element, String option, WebDriver driver) {	
		Select selection = new Select(element);
		selection.selectByVisibleText(option);
	}
	
	
    public boolean isMultileSelect(Select select) {
		
		return select.isMultiple();
	}
	
}
