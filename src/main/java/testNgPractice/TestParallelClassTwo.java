package testNgPractice;


import org.testng.annotations.Test;

/**
 * Created by MamathaGangappa on 4/7/17.
 */


public class TestParallelClassTwo {

    @Test
    public void testCaseOne() {
        //Printing class name and Id of the thread on using which test method got executed
        System.out.println("Test Case One in " + getClass().getSimpleName()
                + " with Thread Id:- " + Thread.currentThread().getId());
    }

    @Test
    public void testCaseTwo() {
        //Printing class name and Id of the thread on using which test method got executed
        System.out.println("Test Case Two in " + getClass().getSimpleName()
                + " with Thread Id:- " + Thread.currentThread().getId());
    }

}
