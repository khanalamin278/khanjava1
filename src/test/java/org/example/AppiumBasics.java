package org.example;
import io.appium.java_client.AppiumBy;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import resource.BaseText;

//import java.io.File;
import java.net.MalformedURLException;
//import java.net.URL;


public class AppiumBasics extends BaseText {
    @Test
    public void WifiSettingsName() throws MalformedURLException {
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
    }
}

//public class AppiumBasics {
//    @Test
//    public void AppiumTest() throws MalformedURLException {
//        AppiumDriverLocalService service = new AppiumServiceBuilder()
//                .withAppiumJS(new File("C://Users//hp//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
//                .withIPAddress("127.0.0.1")
//                .usingPort(4723)
//                .build();
//        service.start();
//
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setDeviceName("Pixel 3a API 34");
//        options.setApp("C://Programming//QaWorks//khan//src//test//java//resource//ApiDemos-debug.apk");
//
//        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
//        driver.quit();
//        service.stop();
//    }
//
//    @AfterClass
//    public void tearDown{
//        driver.quot();
//        service.stop();
//    }
//}

