package test;

import WikiScreens.MainScreen;
import WikiScreens.SearchScreen;
import configWiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchArticle2 extends ConfigurationWiki {

    @Test
    public void searchArticleNew() {
        boolean isLinerPresent = new MainScreen(driver)
                .clickOnSearchFromMainPage()
                .fillInText("cat")
                .closeBoard()
                .isLinerPresent();

        Assert.assertTrue(isLinerPresent);
    }
}
