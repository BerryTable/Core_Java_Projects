package OOPS.Inheritance.Inheritance;

/**
 * Created by MamathaGangappa on 4/5/17.
 */
public class BMWCar extends ModernCar{

    int price;

    public  BMWCar()
    {
        System.out.println("Constructor inside BMW car");
    }


    public void start()
    {
        System.out.println("start in BMW ");
    }

   public void theft()
   {
       System.out.println("Theft");
   }
    }

