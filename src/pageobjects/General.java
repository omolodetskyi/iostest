package pageobjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class General {
	public General(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='UICatalog']")
	public MobileElement UICatalogButton;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	public MobileElement screenTitle; 
}
