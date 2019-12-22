package tests;
import general.TestBase;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonTest extends TestBase{
	
  @Test
  public void buttonScreenIsOpened() throws MalformedURLException {
	  String screenCaptionActual, screenCaptionExpected;
	  screenCaptionExpected="Buttons";
	  IOSDriver<IOSElement> driver =mycapabilities();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElementByXPath("//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]").click();
	  screenCaptionActual=driver.findElementByXPath("//XCUIElementTypeNavigationBar[@name='Buttons']").getAttribute("name");
	  Assert.assertEquals(screenCaptionActual, screenCaptionExpected);
  }
}
