package Basics;

/**
 * Created by MamathaGangappa on 4/2/17.
 */
public class stringOperations {
    public static void main(String[] args) {


        String str = new String();
        str = "hi tehre";
        System.out.println(str.indexOf("e",3));
        //indexof(character to search, Search Position to start from )
        //Returns position on success and -1 on failure
        System.out.println(str.lastIndexOf("e"));
        System.out.println(str.charAt(5));
        System.out.println(str.contains("hello"));
        System.out.println(str.contains("hi"));
        System.out.println(str.hashCode());
        System.out.println(str.length());

    }


}
