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
    @FindBy(xpath = "//*[@class ='TextInputLayout']")
    MobileElement password;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/login_button'")
    MobileElement logButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/text_input_password_toggle']")
    MobileElement toggleButton;



    public HomeScreen fillInLoginForm(Auth user){
       // should(username,20);
        type(username,user.getUsername());
        should(username,40);
        toggleButton.click();
        type(password, user.getPassword());
        logButton.click();
        return new HomeScreen(driver);
    }



}
