package test;

import WikiScreens.MainScreen;
import configWiki.ConfigurationWiki;
import configWiki.DataProviderWiki;
import model.Auth;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ConfigurationWiki {

    @Test
    public void loginTest1() {
        boolean isLogged = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLogInWikiButton()
                .fillInLoginForm(Auth.builder().username("juliakliot.jk").password("Misha240613").build())
                .clickOnFlowButton()
                .isLogged();

        Assert.assertTrue(isLogged);
    }

    @Test(dataProvider = "loginData", dataProviderClass = DataProviderWiki.class)
    public void loginTest2(Auth user) {
        new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLogInWikiButton()
                .fillInLoginForm(user)
                .clickOnFlowButton()
                .logOut();
        //.clickOnFlowButton()
        //.isLogiButtonPresent();

        // Assert.assertTrue(isLogiButtonPresent);
    }

    @Test(dataProvider = "loginDataCvs", dataProviderClass = DataProviderWiki.class)
    public void loginDataFromCSV(Auth user) {
        String inf = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLogInWikiButton()
                .fillInLoginForm(user)
                .clickOnFlowButton()
                .isAccountPresentAssert()
                .logOut()
                //.isElOnMainPagePresAssert()
                .clickOnFlowButton()
                .getInf();
        Assert.assertEquals(inf, "Log in to Wikipedia");

    }
}

