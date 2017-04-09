package JUNIT_Samples;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by MamathaGangappa on 4/5/17.
 */
public class Sample3 {


    @After
    public void test_After() {
        System.out.println(" Testing AFTER Ann");
    }
    @Test

    public void test_CheckString_Warning() {
        String str = "Test Case in Sample 3 ";
        System.out.println(str);
        assertEquals("Test Case in Sample 3 ",str);

    }
}
