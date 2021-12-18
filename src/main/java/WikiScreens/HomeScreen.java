package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomeScreen extends BaseScreen{
    public HomeScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[text()='Juliakliot.jk']")
    MobileElement accountName;

    public boolean isAccountPresent() {
       // should(accountName,20);
        return accountName.isDisplayed();
    }
    public HomeScreen isAccountPresentAssert() {
        Assert.assertTrue(accountName.isDisplayed());
        return this;
    }
}
