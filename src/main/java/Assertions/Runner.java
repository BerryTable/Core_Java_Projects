package Assertions;
import Basics.primeNumberChecker;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {

/**
 * Created by MamathaGangappa on 4/5/17.
 */


    public static void main(String[] args) {


        Result result = JUnitCore.runClasses(TestAssertions.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}

