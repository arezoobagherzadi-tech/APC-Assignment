import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MenuElements {
    AppiumDriver driver;
    public By menu (){
        return By.xpath("//android.widget.ImageButton[@content-desc=\"ClevCalc\"]");

    }

    public By settings (){
        return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
    }

    public By unit_converter (){
        return By.id("com.dencreak.dlcalculator:id/lay_normal_body_more");
    }

    public By date_calculator(){
        return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[15]/android.widget.LinearLayout/android.widget.TextView");
    }
}
