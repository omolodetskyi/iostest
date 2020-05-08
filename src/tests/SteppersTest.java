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
import pageobjects.SteppersScreen;


public class SteppersTest extends TestBase{
	IOSDriver<IOSElement> driver;
	MainScreen mainScreen;
	SteppersScreen steppersScreen;
	
	@BeforeTest
	public void initiateDriver() throws MalformedURLException {
	driver =mycapabilities();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	mainScreen=new MainScreen(driver);
	steppersScreen=new SteppersScreen(driver);
	}
	@Test
	public void stepperTest(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 HashMap<String,String> parameters=new HashMap<String,String>();
		 parameters.put("direction", "down");
		 js.executeScript("mobile: scroll", parameters);
		 mainScreen.SteppersMenuItem.click();
		 steppersScreen.Increment1.click();
		 steppersScreen.Increment1.click();
		 Assert.assertEquals(steppersScreen.Result1.getAttribute("value"),"2");
	}
}
