package WikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import model.Auth;
import org.openqa.selenium.support.FindBy;

public class LoginScreen extends  BaseScreen{
    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/login_username_text']")
    MobileElement username;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/login_password_input'")
    MobileElement password;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/login_button'")
    MobileElement logButton;


    public HomeScreen fillInLoginForm(Auth user){
        type(username,user.getUsername() );
        type(password, user.getPassword());
        logButton.click();
        return new HomeScreen(driver);
    }

}
