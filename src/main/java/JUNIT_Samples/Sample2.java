package JUNIT_Samples;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by MamathaGangappa on 4/5/17.
 */
public class Sample2 {


    @BeforeClass
    public static void test_BeforeClassAnn() {
        System.out.println(" Testing Before Class Ann");
    }
    @Test

    public void test_CheckString_Pass_2() {
        String str = "Test Case in Sample 2";
        //System.out.println(str);
        //assertEquals("Test Case in Sample 2",str);

        ArrayList<String> strarr = new ArrayList<String>();
        strarr.add("Junit");
        strarr.add("is");
        strarr.add("working");
        strarr.add("fine");
        //To compare an array item
       assertEquals(strarr.get(2),"workings");
       //assertFalse(strarr.get(3),false);
    }

}
