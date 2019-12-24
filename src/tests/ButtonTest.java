package tests;
import general.TestBase;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ButtonTest extends TestBase{
	IOSDriver<IOSElement> driver;
 @BeforeTest
	public void initiateDriver() throws MalformedURLException {
	driver =mycapabilities();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 }

 @AfterTest
 public void cleanUp() {
	 
	 driver.findElementByXPath("//XCUIElementTypeButton[@name='UICatalog']").click();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 }

  @Test (priority=1)
  public void buttonScreenIsOpened()  {
	  
	  String screenCaptionActual, screenCaptionExpected;
	  screenCaptionExpected="Buttons";
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElementByXPath("//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]").click();
	  screenCaptionActual=driver.findElementByXPath("//XCUIElementTypeNavigationBar[@name='Buttons']").getAttribute("name");
	  Assert.assertEquals(screenCaptionActual, screenCaptionExpected);
	  
  }
  
  @Test (priority=2)
  public void alertScreenIsOpened() {
	  
	  String screenCaptionActual, screenCaptionExpected;
	  screenCaptionExpected="Date Picker";
	  driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Date Picker']").click();
	  screenCaptionActual=driver.findElementByXPath("//XCUIElementTypeNavigationBar[@name='Date Picker']").getAttribute("name");
	  Assert.assertEquals(screenCaptionActual, screenCaptionExpected);
	  
  }
}
