package Basics;

/**
 * Created by MamathaGangappa on 4/3/17.
 */
public class random_generator {

    public static void main(String[] args) {

        int rand_value = rand_gen(77);
         System.out.println(rand_value);

    }

    public static int rand_gen(int n)
    {
        double d= Math.random()*10;
        int d1= (int) d;
        return d1;
    }
}
