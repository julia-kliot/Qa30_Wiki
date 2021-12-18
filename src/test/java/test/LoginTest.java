package test;

import WikiScreens.MainScreen;
import configWiki.ConfigurationWiki;
import model.Auth;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ConfigurationWiki {

    @Test
    public void loginTest(){
        new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLogInWikiButton()
                .fillInLoginForm(Auth.builder().username("juliakliot.jk").password("Misha240613").build());




    }

}
