
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;

public class ex1 {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");

        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Rahul");

        dc.setCapability(MobileCapabilityType.APP,"C:/Users/Rahul Gupta/Downloads/com.teenpatti.hd.gold_7.76-73776_minAPI19(arm64-v8a,armeabi)(nodpi)_apkmirror.com.apk");

        URL url  = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url,dc);

        Thread.sleep(2000);

    }
}
