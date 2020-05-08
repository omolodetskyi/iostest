package tests;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import general.TestBase;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import pageobjects.ActionSheetsScreen;
import pageobjects.AlertViewsScreen;
import pageobjects.MainScreen;

public class ActionSheetsTest extends TestBase {
	IOSDriver<IOSElement> driver;
	MainScreen mainScreen;
	ActionSheetsScreen actionSheetsScreen;
	@BeforeTest
	public void initiateDriver() throws MalformedURLException {
	driver =mycapabilities();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	mainScreen=new MainScreen(driver);
	actionSheetsScreen=new ActionSheetsScreen(driver);
	
 }
	@Test
	public void dialogWindowTest(){
		mainScreen.ActionSheetsMenuItem.click();
		actionSheetsScreen.okCancelButton.click();
		actionSheetsScreen.okButton.click();
	}
}
