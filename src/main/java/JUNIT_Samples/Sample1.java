package JUNIT_Samples;
import com.sun.tools.doclets.internal.toolkit.util.SourceToHTMLConverter;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by MamathaGangappa on 4/5/17.
 */
public class Sample1 {

    @After
    public void test_After() {
        System.out.println("AFTER Ann");
    }

    @AfterClass
    public static void test_AfterClassAnn() {
        System.out.println("Testing AFTER CLASS Ann");
    }


    @BeforeClass
    public static void test_BeforeClassAnn() {
        System.out.println(" Testing Before Class Ann");
    }

    @Before
    public void testBefore() {
        System.out.println("Testing BEFORE Ann");
    }

    @Test

    public void test_CheckString_Pass_1() {
        String str = "Test Case in Sample 1";
        System.out.println(str);
        assertEquals("Test Case in Sample 1", str);
    }


    @Test

    public void CheckString_Pass_2() {
        String str = "Test case 2";
        System.out.println(str);
        assertEquals("Test case 2", str);
    }


    @Test

    public void test_CheckString_Pass_3() {
        String str = "Test case 3";
        System.out.println(str);
        assertEquals("Test case 3", str);
    }

}


