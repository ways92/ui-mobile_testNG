package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class BaseClass {

    public static AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setup(){

        try {
        DesiredCapabilities caps = new DesiredCapabilities();
        String pathProp =  System.getProperty("user.dir");


        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","11.0");
        caps.setCapability("deviceName","Pixel 3a API 30");
        caps.setCapability("udid","emulator-5554");
        caps.setCapability("app",pathProp+"\\src\\test\\resources\\apps\\SampleApp.apk");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url,caps);

        } catch (Exception e) {
            System.out.println("The cause is : "+e.getCause());
            System.out.println("The message is : "+e.getMessage());
            e.printStackTrace();
        }

    }



    public void teardown(){
        driver.close();
    }
}
