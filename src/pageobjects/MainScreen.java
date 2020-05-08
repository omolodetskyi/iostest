package pageobjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MainScreen {
	public MainScreen(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]")
	public MobileElement ButtonsMenuItem;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Date Picker']")
	public MobileElement DatePickerMenuItem;
	@iOSXCUITFindBy(accessibility="Text Fields")
	public MobileElement TextFieldsMenuItem;
	@iOSXCUITFindBy(accessibility="Action Sheets")
	public MobileElement ActionSheetsMenuItem;
	@iOSXCUITFindBy(accessibility="Alert Views")
	public MobileElement AlertViewsMenuItem;
	@iOSXCUITFindBy(accessibility="Sliders")
	public MobileElement SlidersMenuItem;
	@iOSXCUITFindBy(accessibility="Steppers")
	public MobileElement SteppersMenuItem;
	@iOSXCUITFindBy(accessibility="Switches")
	public MobileElement SwitchesMenuItem;
	
}
