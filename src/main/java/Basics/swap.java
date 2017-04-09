package Basics;

/**
 * Created by MamathaGangappa on 4/3/17.
 */
public class swap {
    int x,y;

    public static void main(String[] args) {

        swap s= new swap();
        s.x= 100;
        s.y= 200;

        System.out.println(s.x + "----" + s.y);
        swapbyValues(s.x,s.y);
        System.out.println("values not swapped  "+ s.x + "----" + s.y);
        swapv(s);
        System.out.println("values swapped  " +s.x + "----" + s.y);
    }

    public static void swapbyValues(int a,int b)
    {
        int temp;
        temp =a;
        a=b;
        b=temp;
        //System.out.println("internal");
        //System.out.println(" a value is " + a+ "------" +b);

    }

    public static void swapv(swap p)
    {
        int temp = p.x;
        p.x= p.y;
        p.y = temp;

    }
}
