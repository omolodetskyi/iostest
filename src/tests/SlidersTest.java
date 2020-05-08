package tests;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.offset.ElementOption.element;
import general.TestBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import pageobjects.MainScreen;
import pageobjects.SlidersScreen;
import pageobjects.TextFields;

public class SlidersTest extends TestBase{
	IOSDriver<IOSElement> driver;
	MainScreen mainScreen;
	SlidersScreen slidersScreen;
	
	@BeforeTest
	public void initiateDriver() throws MalformedURLException {
	driver =mycapabilities();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	mainScreen=new MainScreen(driver);
	slidersScreen=new SlidersScreen(driver);
 }
	@Test(priority=1)
	public void sliderTest(){
		mainScreen.SlidersMenuItem.click();
		slidersScreen.DefaultSlider.sendKeys("0.5");
		//slidersScreen.DefaultSlider.setValue("0");	
	}
	@Test(priority=2)
	public void sliderTest2(){
		Dimension size=slidersScreen.DefaultSlider.getSize();
		TouchAction action=new TouchAction(driver);
		ElementOption press=element(slidersScreen.DefaultSlider,size.width/2 ,size.height/2);
		ElementOption move=element(slidersScreen.DefaultSlider,(int)(size.width*1.05),size.height/2);
		action.press(press).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(move).release();
		action.perform();
		Assert.assertEquals(slidersScreen.DefaultSlider.getAttribute("value"),"90%");
	}
}
