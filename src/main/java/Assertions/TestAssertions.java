package Assertions;

/**
 * Created by MamathaGangappa on 4/5/17.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAssertions {

    @Test

    public void testAssertions () {
        //test data

        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";
        String str6 = new String();
        String str7 = new String();
        str6 = "Hello";
        str7 = "Hello";


        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};

        System.out.println(str6.equals(str7));
        System.out.println(str1.equals(str2));
        System.out.println(str4.equals(str5));
        assertEquals(str6, str7);
        System.out.println(str6.hashCode());
        System.out.println(str7.hashCode());


        //Check that two objects are equal
        assertEquals(str1, str2);
        //System.out.println(str1.hashCode());
        //System.out.println(str2.hashCode());

        //Check that a condition is true
        assertTrue(val1 < val2);

        //Check that a condition is false
        assertFalse(val1 > val2);

        //Check that an object isn't null
        assertNotNull(str1);

        //Check that an object is null
        assertNull(str3);

        //Check if two object references point to the same object
        assertSame(str4, str5);
        System.out.println("String 4  " +str4.hashCode());
        System.out.println("String 5  " +str5.hashCode());

        //Check if two object references not point to the same object
        assertNotSame(str1, str3);

        //Check whether two arrays are equal to each other.
        assertArrayEquals(expectedArray, resultArray);
    }


    }

