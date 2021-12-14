package test;

import WikiScreens.MainScreen;
import configWiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchTest extends ConfigurationWiki {
    @Test
    public void  launchTest(){
        logger.info("Start main page");
        String detail = new MainScreen(driver).getDetail();
        Assert.assertEquals(detail, "In the news");

    }
}
