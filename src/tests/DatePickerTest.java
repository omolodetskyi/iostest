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
import pageobjects.DatePickerScreen;
import pageobjects.General;
import pageobjects.MainScreen;

public class DatePickerTest extends TestBase {
	IOSDriver<IOSElement> driver;
	MainScreen mainScreen;
	DatePickerScreen datePickerScreen;
	@BeforeTest
	public void initiateDriver() throws MalformedURLException {
	driver =mycapabilities();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	mainScreen=new MainScreen(driver);
	datePickerScreen=new DatePickerScreen(driver);
 }
	@Test
	public void setDateTest(){
		mainScreen.DatePickerMenuItem.click();
		//"Thu, Jan 16"
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 HashMap<String,String> parameters=new HashMap<String,String>();
		 parameters.put("order", "next");
		 parameters.put("offset", "0.4");
		 parameters.put("element", datePickerScreen.DateWheel.getId());
		 js.executeScript("mobile: selectPickerWheelValue", parameters);
		 datePickerScreen.HourWheel.setValue("2");
		 datePickerScreen.MinuteWheel.sendKeys("45");
		 datePickerScreen.AMPMWheel.setValue("PM");
	}
}
