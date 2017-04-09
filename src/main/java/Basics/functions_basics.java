package Basics;

/**
 * Created by MamathaGangappa on 4/3/17.
 */
public class functions_basics {
    public static void main(String[] args)
    {
        int mul ;
        sumAll(1,2,3);
        sumAll("hello",1,2);
        mul= multiplyAll(1,2,5);
        System.out.println(mul);
        System.out.println(sum_n(10));

    }

    public static void sumAll(int a,int b, int c)
    {
        int sum = a+b+c;//here sum acts as local variable . They have life only within the sumAll function
        System.out.println(sum);
    }


    public static void sumAll(String a,int b, int c)
    {

        System.out.println(a+b+c);
    }
    public static  int multiplyAll(int a,int b, int c)
    {
        int value = a*b*c;
        return value;

    }

    public static int sum_n(int n)
    {
        int sum =0;
        for (int i = 0; i < n; i++)
            sum = sum + i;
        return sum;
    }
}
