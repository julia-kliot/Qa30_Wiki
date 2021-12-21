package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TultipLoginScreen  extends  BaseScreen{
    public TultipLoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id= 'org.wikipedia:id/explore_overflow_account_name']")
    MobileElement logWikiButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_log_out']")
    MobileElement logOutButton;



    public LoginScreen clickOnLogInWikiButton() {
        should(logWikiButton,20);
        logWikiButton.click();
        return new LoginScreen(driver);

    }
    public boolean isLogged() {
        should(logOutButton,20);
        return logOutButton.isDisplayed();
    }
    public MainScreen logOut(){
        logOutButton.click();
        return new MainScreen(driver);
    }
    public TultipLoginScreen isAccountPresentAssert() {
        Assert.assertTrue(logOutButton.isDisplayed());
        return this;
    }
        public String getInf () {
            return logWikiButton.getText();
        }
    }



