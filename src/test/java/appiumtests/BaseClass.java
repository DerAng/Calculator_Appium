package appiumtests;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {
	
	
	static AppiumDriver<MobileElement> driver;
	

	
	
	@BeforeTest
	
	public static void setup() throws Exception {
		
		
	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability("deviceName", "WAS-LX3");
	cap.setCapability("udid", "6XTDU17717001183");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "8.0.0");
	
	
	cap.setCapability("appPackage", "com.android.calculator2");
	cap.setCapability("appActivity", "com.android.calculator2.Calculator");
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AppiumDriver<MobileElement>(url,cap);
	System.out.println("Aplication started....");
	
	}
	
	
	
	
	

}
