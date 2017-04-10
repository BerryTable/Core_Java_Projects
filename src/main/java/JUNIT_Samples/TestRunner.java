package JUNIT_Samples;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//Need to check whats the difference b/w Runner and @RunWith Suites

/**
 * Created by MamathaGangappa on 4/5/17.
 */
public class TestRunner {


     public static void main(String[] args) {
       //  Result result = JUnitCore.runClasses(Sample2.class,Sample3.class,TestEmployeeDetails.class);
         Result result = JUnitCore.runClasses(Sample3.class);

         //Result result = JUnitCore.runClasses(TestAssertions.class);

            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }

            System.out.println(result.wasSuccessful());
        }
    }

