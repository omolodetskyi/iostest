package tests;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import general.TestBase;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import pageobjects.AlertViewsScreen;
import pageobjects.MainScreen;

public class DialogWindowsTest extends TestBase {
	IOSDriver<IOSElement> driver;
	MainScreen mainScreen;
	AlertViewsScreen alertViewsScreen;
	@BeforeTest
	public void initiateDriver() throws MalformedURLException {
	driver =mycapabilities();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	mainScreen=new MainScreen(driver);
	alertViewsScreen=new AlertViewsScreen(driver);
 }
	@Test
	public void dialogWindowTest(){
		mainScreen.AlertViewsMenuItem.click();
		alertViewsScreen.textEntry.click();
		String expectedDialogLabel="A Short Title Is Best";
		String actualDialogLabel=alertViewsScreen.dialogTitle.getAttribute("label");
		Assert.assertEquals(actualDialogLabel, expectedDialogLabel);
		alertViewsScreen.textField.sendKeys("hello");
		alertViewsScreen.okButton.click();
	}
}
