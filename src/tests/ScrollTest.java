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
import pageobjects.TextFields;

public class ScrollTest extends TestBase{
	IOSDriver<IOSElement> driver;
	MainScreen mainScreen;
	TextFields textFields;
	 @BeforeTest
		public void initiateDriver() throws MalformedURLException {
		driver =mycapabilities();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		mainScreen=new MainScreen(driver);
		textFields=new TextFields(driver);
	 }
	 @Test(priority=1)
	 public void scrollTest(){
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 HashMap<String,String> parameters=new HashMap<String,String>();
		 parameters.put("direction", "down");
		 js.executeScript("mobile: scroll", parameters);
		 String expectedLabel="Text Fields";
		 String actualLabel=mainScreen.TextFieldsMenuItem.getAttribute("label");
		 //String actualLabel=driver.findElementByAccessibilityId("Text Fields").getAttribute("label");
		 Assert.assertEquals(actualLabel, expectedLabel);
	 }
	 @Test(priority=2, dependsOnMethods="scrollTest")
	 public void textTest(){
		 mainScreen.TextFieldsMenuItem.click();
		 String expectedPlaceHolder="Placeholder text";
		 String actualPlaceHolder=textFields.defaultTextField.getAttribute("value");
		 Assert.assertEquals(actualPlaceHolder, expectedPlaceHolder);
		 textFields.defaultTextField.clear();
		 driver.getKeyboard().sendKeys("test");
		 //textFields.defaultTextField.sendKeys("test");
	 }
}
