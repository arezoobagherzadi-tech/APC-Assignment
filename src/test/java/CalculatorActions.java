import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.springframework.util.Assert;

public class CalculatorActions {
    AppiumDriver driver;
    public CalculatorActions(AppiumDriver driver){
        this.driver = driver;
    }

    public void clickElement(By locator){
        driver.findElement(locator).click();

    }

    public void assertResult(By locator, String expectedResult){

        String actualResult = driver.findElement(locator).getText();
        Assert.isTrue(actualResult.equals(expectedResult));
    }

    public void insertText(By locator,String txt){
        driver.findElement(locator).sendKeys(txt);
    }
}
