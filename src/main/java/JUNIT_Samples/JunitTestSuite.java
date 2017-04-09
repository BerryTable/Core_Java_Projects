package JUNIT_Samples;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * Created by MamathaGangappa on 4/5/17.
 */


    //JUnit Suite Test
    @RunWith(Suite.class)

   /*@Suite.SuiteClasses({
            Sample1.class ,Sample2.class,Sample3.class
    }) */


   @Suite.SuiteClasses({
            Sample2.class}
            )
    public class JunitTestSuite {
    }
