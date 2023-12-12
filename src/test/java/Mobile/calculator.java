package Mobile;

import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class calculator {

    @Test
    public void checkMultiplication() throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability("deviceName", "Rahul");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platfornVersion", "12");

        dc.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        dc.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, dc);

        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05")).click();
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul")).click();
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05")).click();
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal")).click();
        String result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
        Assert.assertEquals(result,"25 Calculation result");

//        Thread.sleep(3000);
        driver.quit();

    }
}
