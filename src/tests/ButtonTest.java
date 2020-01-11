package tests;
import general.TestBase;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import pageobjects.General;
import pageobjects.MainScreen;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ButtonTest extends TestBase{
	IOSDriver<IOSElement> driver;
	MainScreen mainScreen;
	General general;
 @BeforeTest
	public void initiateDriver() throws MalformedURLException {
	driver =mycapabilities();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	mainScreen=new MainScreen(driver);
	general=new General(driver);
 }

 @AfterMethod
 public void cleanUp() {
	 general.UICatalogButton.click();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 }

  @Test (priority=1)
  public void buttonScreenIsOpened()  {
	  String screenCaptionActual, screenCaptionExpected;
	  screenCaptionExpected="Buttons";
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  mainScreen.ButtonsMenuItem.click();
	  screenCaptionActual=general.screenTitle.getAttribute("name");
	  Assert.assertEquals(screenCaptionActual, screenCaptionExpected);
	  
  }
  
  @Test (priority=2)
  public void alertScreenIsOpened() {
	
	  String screenCaptionActual, screenCaptionExpected;
	  screenCaptionExpected="Date Picker";
	  mainScreen.DatePickerMenuItem.click();
	  screenCaptionActual=general.screenTitle.getAttribute("name");
	  Assert.assertEquals(screenCaptionActual, screenCaptionExpected);
	  
  }
}
