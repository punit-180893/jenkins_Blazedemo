package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;
	protected static File file = new File("./payload/payload.properties");
	protected static FileInputStream fiStream = null;
	protected static Properties properties = new Properties();
	static {
		try {
		fiStream = new FileInputStream(file);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			properties.load(fiStream);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
//	Initialize the browser.
	@BeforeClass
	public void browserInitializer() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
//	Open targeted web site.
	@BeforeMethod
	public void openUrl() {
		driver.get(properties.getProperty("url"));
	}
//	Tear down method
	@AfterSuite
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
