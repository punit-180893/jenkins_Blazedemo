package tests;

import org.testng.annotations.Test;

import page.FlightChoosePage;
import page.HomePage;
import page.PurchasePage;
import utils.BaseClass;

public class HomeTest extends BaseClass {

		FlightChoosePage choice;
		HomePage homepage;
		PurchasePage purchase;
	
	@Test
	public void homeTest() {
		homepage = new HomePage(driver);
		homepage.selectDeparture("Boston");
		homepage.selectDestination("Rome");
		homepage.clickSubmit();
		
	}

	@Test 
	public void chooseTest() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.selectDeparture("Boston");
		homepage.selectDestination("Rome");
		homepage.clickSubmit();
		choice = new FlightChoosePage(driver);
		choice.clickOnChoose();
	}
	
	@Test
	public void formFill() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.selectDeparture("Boston");
		homepage.selectDestination("Rome");
		homepage.clickSubmit();
		choice = new FlightChoosePage(driver);
		choice.clickOnChoose();
		purchase = new PurchasePage(driver);
		purchase.formFillUp("Rajib M", "Kolkata,W.B", "Kolkata", "W.B", "700001", "American Express", "408998760988", "04", "2029", "Rajib");
	}
}
