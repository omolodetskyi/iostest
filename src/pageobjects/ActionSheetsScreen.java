package pageobjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ActionSheetsScreen {
	public ActionSheetsScreen(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@iOSXCUITFindBy(accessibility="Okay / Cancel")
	public MobileElement okCancelButton;
	@iOSXCUITFindBy(accessibility="OK")
	public MobileElement okButton;
}
