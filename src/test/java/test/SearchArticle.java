package test;

import WikiScreens.MainScreen;
import WikiScreens.SearchScreen;
import configWiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchArticle extends ConfigurationWiki {
    @BeforeMethod
    public void PreconSearch(){
        new MainScreen(driver)
                .clickOnSearchFromMainPage();

    }
    @Test
    public void  searchArticleTest(){
     boolean isLinerPresent =  new SearchScreen(driver)
                .fillInText("dog")
                .closeBoard()
                .isLinerPresent();

        Assert.assertTrue(isLinerPresent);





    }
}
