package OOPS.Inheritance.Inheritance;

/**
 * Created by MamathaGangappa on 3/28/17.
 */
public class Car  {


        String colur;
        int speed;
        int capacity ;

        void set_attributes(){
            colur = "Blue";
            speed = 100;
            capacity =5;
        }

        void get_Attributes()

        {
            set_attributes();
            System.out.println("colur is " + colur);
            System.out.println("speed is " + speed);
            System.out.println("Capacity is : "+ capacity);
        }
    }

