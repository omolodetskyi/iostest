package pageobjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AlertViewsScreen {
	public AlertViewsScreen(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@iOSXCUITFindBy(accessibility="Text Entry")
	public MobileElement textEntry;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='A Short Title Is Best']")
	public MobileElement dialogTitle;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeAlert[@name='A Short Title Is Best']/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther")
	public MobileElement textField;
	@iOSXCUITFindBy(accessibility="OK")
	public MobileElement okButton;
}
