package configWiki;

import model.Auth;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderWiki {
    @DataProvider
    public Iterator<Object[]> loginData() {
        List<Object[]> list = new ArrayList<>();
        list.add((new Object[]{Auth.builder().username("juliakliot.jk").password("Misha240613").build()}));
        list.add((new Object[]{Auth.builder().username("julia357").password("Misha*$240613").build()}));

        return list.iterator();
    }
}
