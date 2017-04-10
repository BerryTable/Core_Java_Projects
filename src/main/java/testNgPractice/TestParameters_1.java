package testNgPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/*
 * Created by MamathaGangappa on 4/7/17.
*/
public class TestParameters_1 {

    @Parameters({ "browser" })
    @Test(priority = 4)
    public void testCaseOne(String browser)
    {
        System.out.println("browser passed as :- " + browser);
    }

    @Parameters({ "username", "password" })
    @Test(priority = 3)
    public void testCaseTwo(String username, String password) {
        System.out.println("Parameter for User Name passed as :- " + username);
        System.out.println("Parameter for Password passed as :- " + password);
    }

    @Parameters({ "browser1" })
    @Test(priority = 2)
    public void testCase1(String browser1)
    {
        System.out.println("browser passed as :- " + browser1);
    }

    @Parameters({ "username1", "password1" })
    @Test(priority = 1)
    public void testCase2(String username1, String password1) {
        System.out.println("Parameter for User Name passed as :- " + username1);
        System.out.println("Parameter for Password passed as :- " + password1);
    }
}