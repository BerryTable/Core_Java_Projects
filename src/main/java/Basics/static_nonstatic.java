package Basics;

/**
 * Created by MamathaGangappa on 4/3/17.
 */
public class static_nonstatic {


    String  emp_name; //non static global variable
    static int emp_age; // static global variable

    public static void main(String[] args) { //static  function
        //multiply(); - This is a non static method, so cannot be called from static function
        sum();

    }

    public static void sum() {
        int a; //local variable
        a= 100;
        System.out.println(a);

        //emp name is non static.So cannot be called from static function , even though its global
        // emp_name= "MG";
        //System.out.println(emp_name);


        //emp age is a static variable .So it can be called static function
        emp_age = 22;
        System.out.println(emp_age);
    }

    public void multiply()
    {
        emp_name= "MG";
        emp_age = 22;
        System.out.println(emp_name);
        System.out.println(emp_age);
    }
}
