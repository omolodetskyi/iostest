package pageobjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class DatePickerScreen {
	public DatePickerScreen(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@iOSXCUITFindBy(xpath="//XCUIElementTypePickerWheel[1]")
	public MobileElement DateWheel;
	@iOSXCUITFindBy(xpath="//XCUIElementTypePickerWheel[2]")
	public MobileElement HourWheel;
	@iOSXCUITFindBy(xpath="//XCUIElementTypePickerWheel[3]")
	public MobileElement MinuteWheel;
	@iOSXCUITFindBy(xpath="//XCUIElementTypePickerWheel[4]")
	public MobileElement AMPMWheel;
}
