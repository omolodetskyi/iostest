package pageobjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SteppersScreen {
	public SteppersScreen(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeButton[@name='Increment'])[1]")
    public MobileElement Increment1;
	////XCUIElementTypeStaticText
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
    public MobileElement Result1;
}
