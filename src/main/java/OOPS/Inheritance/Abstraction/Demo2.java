package OOPS.Inheritance.Abstraction;

/**
 * Created by MamathaGangappa on 4/6/17.
 */
abstract class Demo1{
    public void disp1(){
        System.out.println("Concrete method of abstract class");
    }
    abstract public void disp2();
}

class Demo2 extends Demo1{
    /* I have given the body to abstract method of Demo1 class
    It is must if you don't declare abstract method of super class
    compiler would throw an error*/
    public void disp2()
    //public void disp3()//.....comment the above line disp2() , uncomment disp3() and check for the error
    //When an abstract class is inherited, for sure, all the ABSTRACT methods needs to be implemented ..i.e declaration and implementation details shoudl be provided .

    {
        System.out.println("I'm overriding abstract method");
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.disp2();

    }
}