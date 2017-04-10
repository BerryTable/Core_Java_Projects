package testNgPractice;


import jdk.nashorn.internal.ir.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
 * Created by MamathaGangappa on 4/7/17.
*/
public class TestParameters_2 {

    @Parameters({ "browser3" })
    @Test
    public void testCaseThree(String browser3)
    {
        System.out.println("browser passed as :- " + browser3);
    }

    @Parameters({ "username3", "password3" })
    @Test(enabled = true)
    public void testCaseThree3(String username3, String password3) {
        System.out.println("Parameter for User Name passed as :- " + username3);
        System.out.println("Parameter for Password passed as :- " + password3);
    }
}