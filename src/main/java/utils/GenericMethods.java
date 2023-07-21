package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericMethods {
	static WebDriver driver;
	
	public void selectDropDown(WebElement elements,String name) {
		Select select = new Select(elements);
		select.selectByVisibleText(name);
	}
	
	public void sendKeysMethod(WebElement elements,String value) {
		elements.click();
		elements.clear();
		elements.sendKeys(value);
	}
}
