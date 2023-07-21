package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlightChoosePage {
	WebDriver driver;
	public FlightChoosePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH,using="//input[@class = 'btn btn-small']")
	WebElement chooseflight;
	
	public void clickOnChoose() {
		
		chooseflight.click();
	}
}

