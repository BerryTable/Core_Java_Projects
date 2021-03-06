package testNgPractice;

import org.junit.Ignore;
import org.testng.annotations.Test;

/**
 * Created by MamathaGangappa on 4/7/17.
 */

public class TestParallelClassOne {

    @Test
    public void testCaseOne() {
        System.out.println("   ");
        // Printing class name and Id of the thread on using which test method got executed
        System.out.println("Test Case One in " + getClass().getSimpleName()
                + " with Thread Id:- " + Thread.currentThread().getId());
    }

    @Test @Ignore
    public void testCaseTwo() {
        //Printing class name and Id of the thread on using which test method got executed
        System.out.println("Test Case two in " + getClass().getSimpleName()
                + " with Thread Id:- " + Thread.currentThread().getId());
    }

}