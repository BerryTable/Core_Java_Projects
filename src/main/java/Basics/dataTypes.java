package Basics;

/**
 * Created by MamathaGangappa on 4/2/17.
 */
public class dataTypes {

    public static void main(String[] args) {

        String str1 = "Hello there how r u ";
        String str2 = "Im fine";
        int a= 100;
        int b= 200;


        //Concatenation operators////see the difference in output
        System.out.println(a + b + str1 + str2);
        // 300Hello there how r u Im fine

        System.out.println(str1 + str2 + a + b);
        //Hello there how r u Im fine100200

        System.out.println(str1 + str2 + (a+b));
        //Hello there how r u Im fine300
    }

}
