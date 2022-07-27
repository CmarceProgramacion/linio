package com.linio.utils.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverAppiumAndroid {
    public static AppiumDriver<MobileElement> driver;

    public static DriverAppiumAndroid suNavegador() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("appPackage", "com.linio.android");
            capabilities.setCapability("appActivity", "com.linio.android.views.MainActivity");
            capabilities.setCapability("platformVersion", "8.0.0");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("noReset", "true");
            capabilities.setCapability("platformName", "android");

            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new DriverAppiumAndroid();
    }
    public io.appium.java_client.AppiumDriver<MobileElement> on() {
        return driver;
    }
}
