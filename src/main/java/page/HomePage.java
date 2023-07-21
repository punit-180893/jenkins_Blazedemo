package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.GenericMethods;

public class HomePage extends GenericMethods {
	WebDriver driver;

//	Create Construct and initialize the page factory.
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
//	All locators are here
	@FindBy(how = How.NAME,using ="fromPort")
	WebElement departuredrop;

	@FindBy(how = How.NAME,using="toPort")
	WebElement destinationDrop;
	
	@FindBy(how = How.XPATH,using="//input[@class='btn btn-primary']")
	WebElement submitButton;
//	calling selectDropDown method from GenericMethods class and pass the values.
	public void selectDeparture(String name) {
		selectDropDown(departuredrop, name);
	}
//	calling selectDropDown method from GenericMethods class and pass the values.
	public void selectDestination(String name) {
		selectDropDown(destinationDrop, name);
	}
	
	public void clickSubmit() {
		submitButton.click();
	}
}
