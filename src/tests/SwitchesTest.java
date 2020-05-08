package tests;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import general.TestBase;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import pageobjects.MainScreen;
import pageobjects.SwichesScreen;

public class SwitchesTest extends TestBase{
	IOSDriver<IOSElement> driver;
	MainScreen mainScreen;
	SwichesScreen swichesScreen;
	@BeforeTest
	public void initiateDriver() throws MalformedURLException {
	driver =mycapabilities();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	mainScreen=new MainScreen(driver);
	swichesScreen=new SwichesScreen(driver);
 }
	@Test
	public void swichesTest()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 HashMap<String,String> parameters=new HashMap<String,String>();
		 parameters.put("direction", "down");
		 js.executeScript("mobile: scroll", parameters);
		 mainScreen.SwitchesMenuItem.click();
		 swichesScreen.DefaultSwich.click();
		 boolean isFound=true;
		 Assert.assertEquals(swichesScreen.DefaultSwich.getAttribute("value"), "0");
		 Assert.assertEquals(isFound, true);
		 
	}
}
