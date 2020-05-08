package tests;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import general.TestBase;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import pageobjects.MainScreen;
import pageobjects.TextFields;
public class SwipeTest extends TestBase{
	IOSDriver<IOSElement> driver;
	MainScreen mainScreen;
	@BeforeTest
	public void initiateDriver() throws MalformedURLException {
	driver =mycapabilities();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	mainScreen=new MainScreen(driver);
 }
	@Test
	public void swipeTest() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 HashMap<String,String> parameters=new HashMap<String,String>();
		 parameters.put("direction", "up");
		 js.executeScript("mobile: swipe", parameters);
	}
}
