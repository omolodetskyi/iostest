package general;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class TestBase {

	public static IOSDriver<IOSElement> mycapabilities() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "iOS");
		cap.setCapability("platformVersion", "13.3");
		cap.setCapability("automationName", "XCUITest");
		cap.setCapability("deviceName", "iPhone 8");
		cap.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
        IOSDriver<IOSElement> driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;
        //driver.findElementByXPath("//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]").click();
	}

}
