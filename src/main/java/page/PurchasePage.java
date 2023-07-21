package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.GenericMethods;

public class PurchasePage extends GenericMethods {
	WebDriver driver;
	public PurchasePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(how = How.NAME,using="inputName")
	WebElement nameTextBox;
	
	@FindBy(how = How.NAME,using="address")
	WebElement addressTextBox;
	
	@FindBy(how = How.NAME,using="city")
	WebElement cityTextBox;
	
	@FindBy(how = How.NAME,using="state")
	WebElement StateTextBox;
	
	@FindBy(how = How.NAME,using="zipCode")
	WebElement zipTextBox;

	@FindBy(how = How.NAME,using="cardType")
	WebElement cardTypeDrop;
	
	@FindBy(how = How.NAME,using="creditCardNumber")
	WebElement cardNumberTextBox;
	
	@FindBy(how = How.NAME,using="creditCardMonth")
	WebElement monthTextBox;
	
	@FindBy(how = How.NAME,using="creditCardYear")
	WebElement yearTextBox;
	
	@FindBy(how = How.NAME,using="nameOnCard")
	WebElement nameonCardTextBox;
	
	@FindBy(how = How.XPATH,using="//input[@value='Purchase Flight']")
	WebElement purchaseFlightButton;
	
	public void formFillUp(String name,String address,String city,String state, 
			String zipcode,String cardtype,String cardnumber,String cardmonth,String cardyear,String NameOnCard) throws InterruptedException {
		sendKeysMethod(nameTextBox, name);
		sendKeysMethod(addressTextBox, address);
		sendKeysMethod(cityTextBox, city);
		sendKeysMethod(StateTextBox, state);
		sendKeysMethod(zipTextBox, zipcode);
		selectDropDown(cardTypeDrop, cardtype);
		sendKeysMethod(cardNumberTextBox, cardnumber);
		sendKeysMethod(monthTextBox, cardmonth);
		sendKeysMethod(yearTextBox, cardyear);
		sendKeysMethod(nameonCardTextBox, NameOnCard);
		purchaseFlightButton.click();
	}
	
}
