import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class TesBase {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "iOS");
		cap.setCapability("platformVersion", "13.3");
		cap.setCapability("automationName", "XCUITest");
		cap.setCapability("deviceName", "Iphone xr");
		cap.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
        IOSDriver<IOSElement> driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.findElementByXPath("(//XCUIElementTypeButton[@name='chevron'])[5]").click();
	}

}
