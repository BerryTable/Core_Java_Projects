package Basics;

/**
 * Created by MamathaGangappa on 4/2/17.
 */
public class triangle {
    public static void main(String[] args) {
        int a,b,c,sum;
        a=30;
        b=30;
        c=90;

        sum =  a+b+c;
        if (sum>180)
        {
            System.out.println("invalid inputs for the triangle");

        }
        else if (a==b & b==c )
            {
                System.out.println("Equilateral triangle");
            }

        else if ((a==b & b!=c)|| (a==c & b!=c))
            {
                System.out.println("isosceles triangle");
            }
        else
            {
                System.out.println("scalene triangle");
            }


    }
}
