package OOPS.Inheritance.Inheritance;

/**
 * Created by MamathaGangappa on 3/28/17.
 */
public class SportsCar extends Car {

    int seat_capacity;
    String petrol_capacity;

    void set_Seat_capacity()
    {
        seat_capacity= 55;
        System.out.println(seat_capacity);

    }

    void set_Petrol_capacity()
    {
        petrol_capacity= "1 gallon";
        System.out.println(petrol_capacity);

    }
}
