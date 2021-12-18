package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class TultipLoginScreen  extends  BaseScreen{
    public TultipLoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id= 'org.wikipedia:id/explore_overflow_account_name']")
    MobileElement logWikiButton;

    public LoginScreen clickOnLogInWikiButton() {
        should(logWikiButton,20);
        logWikiButton.click();
        return new LoginScreen(driver);

    }
}
