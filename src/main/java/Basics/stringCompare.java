package Basics;


/**
 * Created by MamathaGangappa on 4/3/17.
 */
public class stringCompare
{
    int a=20;
    String name = "MG";

    public static void main(String[] args) {

        stringCompare s1 = new stringCompare();
        stringCompare s2 = new stringCompare();


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));  //false
        System.out.println(s1 == s2);  //false



        String s3= "hello";
        String s4= "hello";

        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println(s3.equals(s4));  //true
        System.out.println(s3 == s4); //true

       


    }

}
