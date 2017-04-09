package OOPS.Inheritance.Abstraction;

/**
 * Created by MamathaGangappa on 4/6/17.
 */

abstract public class AbstractDemo {
    public void myMethod() {
        System.out.println("Hello");
    }

    abstract public void anotherMethod();

    public void anotherMethod_1() {
        System.out.print("Abstract method");
    }


    public static void main(String args[])
    {
        //Can't create object of abstract class - error!
      /*  AbstractDemo obj = new AbstractDemo();
        obj.myMethod();
        obj.anotherMethod();
        obj.anotherMethod_1(); */
    }
}