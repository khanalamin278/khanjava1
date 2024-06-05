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


/*
Appium সার্ভার শুরু করা: AppiumDriverLocalService এর মাধ্যমে।

UiAutomator2Options ক্লাসটি Appium-এ ব্যবহৃত একটি কনফিগারেশন ক্লাস যা অ্যাপ অটোমেশন টেস্টিংয়ের জন্য বিভিন্ন অপশন সেট করে। এটি বিশেষ করে Android ডিভাইসের জন্য UiAutomator2 ব্যাকএন্ডের সাথে কাজ করে।

UiAutomator2Options ক্লাসটি io.appium.java_client প্যাকেজ থেকে এসেছে। এই প্যাকেজটি Appium এর জন্য প্রয়োজনীয় বিভিন্ন ক্লাস ও ইন্টারফেস সরবরাহ করে, যা মোবাইল অ্যাপ্লিকেশন টেস্টিংয়ের জন্য ব্যবহৃত হয়।

/////////////////////

options কী কাজ করছে:
options হল UiAutomator2Options ক্লাসের একটি ইনস্ট্যান্স, যা Android ডিভাইসের জন্য অ্যাপ টেস্টিংয়ের বিভিন্ন কনফিগারেশন সেট করার জন্য ব্যবহৃত হয়।
UiAutomator2Options ব্যবহার করে আপনি আপনার টেস্টের জন্য প্রয়োজনীয় ডিভাইস এবং অ্যাপ সংক্রান্ত সেটিংস নির্ধারণ করতে পারেন।

setDeviceName মেথড: এটি নির্দিষ্ট ডিভাইসের নাম সেট করে। উদাহরণস্বরূপ, এখানে "Pixel 3a API 34" সেট করা হয়েছে। এটি Appium কে জানায় যে কোন ডিভাইসে টেস্টটি চালানো হবে।
setApp মেথড: এটি টেস্ট করার জন্য নির্দিষ্ট অ্যাপের অবস্থান (ফাইল পাথ) সেট করে। এখানে "C://Programming//QaWorks//khan//src//test//java//resource//ApiDemos-debug.apk"
ফাইলটি ব্যবহৃত হচ্ছে। এটি Appium কে জানায় কোন অ্যাপ্লিকেশনটি লোড এবং টেস্ট করা হবে।
AndroidDriver কেন ব্যবহার করা হয়েছে:
AndroidDriver হল Appium এর একটি ক্লাস যা Android ডিভাইসে টেস্ট চালানোর জন্য ব্যবহৃত হয়। এটি ডিভাইসের সাথে সংযোগ স্থাপন করে এবং টেস্ট স্ক্রিপ্ট চালায়।


AndroidDriver কী কাজ করছে:
এই লাইনটি একটি নতুন AndroidDriver অবজেক্ট তৈরি করছে, যা দুটি প্যারামিটার নিচ্ছে:

URL: এটি Appium সার্ভারের URL নির্দেশ করে। এখানে "http://127.0.0.1:4723" ব্যবহার করা হয়েছে, যা লোকালহোস্টে Appium সার্ভার চালানোর নির্দেশ দেয়।
options: এটি UiAutomator2Options অবজেক্ট যা পূর্বে কনফিগার করা হয়েছে, যার মধ্যে ডিভাইসের নাম এবং অ্যাপের অবস্থান উল্লেখ করা হয়েছে।
কেন AndroidDriver ব্যবহার করা হয়েছে:
AndroidDriver ব্যবহার করা হয়েছে যাতে Appium সার্ভার ও Android ডিভাইসের মধ্যে সংযোগ স্থাপন করা যায় এবং কনফিগার করা options ব্যবহার করে নির্দিষ্ট অ্যাপ্লিকেশনটি
টেস্ট করা যায়। AndroidDriver আপনার টেস্ট স্ক্রিপ্টগুলোকে Android ডিভাইসে এক্সিকিউট করে, অ্যাপ্লিকেশনকে চালু করে এবং আপনার দেয়া টেস্ট কেসগুলো রান করে।

কোডের কাজের সারাংশ:

টেস্ট কনফিগার করা: UiAutomator2Options ব্যবহার করে ডিভাইসের নাম এবং অ্যাপের অবস্থান সেট করা।
ড্রাইভার তৈরি করা: AndroidDriver এর মাধ্যমে, যাতে Appium সার্ভার ও Android ডিভাইসের মধ্যে সংযোগ স্থাপন করা যায় এবং কনফিগার করা options ব্যবহার করে অ্যাপটি টেস্ট করা যায়।
ড্রাইভার বন্ধ করা: টেস্ট শেষে driver.quit() এর মাধ্যমে।
সার্ভার বন্ধ করা: service.stop() এর মাধ্যমে।



//////////////////
AppiumServiceBuilder কী কাজ করছে:
AppiumServiceBuilder হল একটি ক্লাস যা Appium সার্ভার শুরু করার জন্য ব্যবহৃত হয়। এটি বিভিন্ন প্যারামিটার গ্রহণ করে এবং Appium সার্ভার কনফিগার করে। এর মাধ্যমে আপনি লোকাল Appium সার্ভারটি কিভাবে শুরু হবে তা নির্ধারণ করতে পারেন।

AppiumServiceBuilder এর বিভিন্ন মেথড:
withAppiumJS(File appiumJS): এই মেথডটি Appium JS ফাইলের অবস্থান সেট করে। এটি সেই ফাইল যা Appium সার্ভার শুরু করার জন্য প্রয়োজন।
withIPAddress(String ipAddress): এই মেথডটি IP ঠিকানা সেট করে। এটি নির্ধারণ করে যে কোন IP ঠিকানায় Appium সার্ভার চলবে।
usingPort(int port): এই মেথডটি পোর্ট নম্বর সেট করে। এটি নির্ধারণ করে যে কোন পোর্টে Appium সার্ভার চলবে।
build(): এই মেথডটি Appium সার্ভিস তৈরি করে, যা পরে শুরু করা যাবে।
কেন AppiumServiceBuilder ব্যবহার করা হয়েছে:
AppiumServiceBuilder ব্যবহার করা হয়েছে লোকাল Appium সার্ভার শুরু করার জন্য। এটি বিভিন্ন কনফিগারেশন সেটিংস (যেমন IP ঠিকানা, পোর্ট নম্বর এবং Appium JS ফাইলের অবস্থান) গ্রহণ করে এবং একটি AppiumDriverLocalService অবজেক্ট তৈরি করে।
এই সার্ভিসটি Android ডিভাইসে টেস্ট চালানোর জন্য প্রয়োজনীয়।

সার্ভিস শুরু এবং বন্ধ করার প্রক্রিয়া:
সার্ভিস শুরু করা:

service.start();
এই লাইনটি সার্ভিস শুরু করে, যার ফলে Appium সার্ভার চালু হয় এবং এটি টেস্টিংয়ের জন্য প্রস্তুত থাকে।

সার্ভিস বন্ধ করা:


service.stop();
টেস্ট সম্পন্ন হওয়ার পর, সার্ভিস বন্ধ করা হয়।


\\\\\\\\\\\\\\
কোডের কাজের সারাংশ:
Appium সার্ভার কনফিগার এবং শুরু করা: AppiumServiceBuilder ব্যবহার করে Appium সার্ভারের জন্য প্রয়োজনীয় কনফিগারেশন সেট করা হয় এবং সার্ভারটি শুরু করা হয়।
টেস্ট কনফিগার করা: UiAutomator2Options ব্যবহার করে টেস্টের জন্য ডিভাইস এবং অ্যাপ সেট করা হয়।
ড্রাইভার তৈরি করা: AndroidDriver ব্যবহার করে, Appium সার্ভারের সাথে সংযোগ স্থাপন করা হয় এবং টেস্ট চালানো হয়।
ড্রাইভার বন্ধ করা: টেস্ট শেষে ড্রাইভার বন্ধ করা হয়।
সার্ভিস বন্ধ করা: সার্ভিস বন্ধ করা হয় যাতে Appium সার্ভার আর চলতে না থাকে।
 */

