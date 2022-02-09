import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class TestSetup {

    static AppiumDriver<MobileElement> driver;
    CalculatorTestCases calculatorTestScenarios;

@BeforeClass
    public void openCalculator() throws MalformedURLException {
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("deviceName","Galaxy A6");
        cap.setCapability("udid","52003deb8c6bc5db");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","10");
        cap.setCapability("appPackage","com.dencreak.dlcalculator");
        cap.setCapability("appActivity","com.dencreak.dlcalculator.DLCalculatorActivity");
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);
        calculatorTestScenarios = new CalculatorTestCases(driver);

    }

    @Test (priority = 1)
    public void calculation_add_tests(){
        calculatorTestScenarios.calculator_add_numbers();
        calculatorTestScenarios.clear_calculator();
    }

    @Test (priority = 2)
    public void calculation_subtract_tests(){
        calculatorTestScenarios.calculator_subtract_numbers();
        calculatorTestScenarios.clear_calculator();
    }

    @Test (priority = 3)
    public void calculation_multiple_tests(){
        calculatorTestScenarios.calculator_multiple_numbers();
        calculatorTestScenarios.clear_calculator();
    }

    @Test (priority = 4)
    public void calculation_unit_converter_tests(){
        calculatorTestScenarios.unit_converter();
    }

    @Test (priority = 5)
    public void calculation_change_unit_converter_tests(){
        calculatorTestScenarios.change_unit_converter();
    }

    @AfterClass
    public void tear_down(){
        driver.closeApp();
    }

        }
