package OOPS.Inheritance.Inheritance;

/**
 * Created by MamathaGangappa on 4/5/17.
 */
public class TestInheritance {

    public static void main(String[] args) {


       /* ModernCar c= new ModernCar();

        c.start();
        c.stop();
        c.refuel();
        c.price = 200;


        BMWCar bmw = new BMWCar();

       bmw.start();
        bmw.price = 300; */




        ModernCar cbmw  = new BMWCar();
        //Only functions  of Super class can be called

        cbmw.refuel(); //called from Car class
        cbmw.start();  //called from BMW class...Overiden method is called . I.e Method of sub class is called when object of Sub Class is created.instaed of the
        cbmw.stop();  //called from Car class
        //cbmw.theft();   ...This will not work

//code to call constructors. To call constructors instance of the class need not be created .
     //   new ModernCar();
       // new BMWCar();


    }
}
