package Basics;

/**
 * Created by MamathaGangappa on 4/2/17.
 */
public class factorial_iterative {


    public static void main(String[] args) {
        int n, fact;
        fact = 1;
        n = 5;
        for (int i = 1; i < n; i++) {
            fact = fact * i;
        }
        System.out.println(n);
        System.out.println("Factorial of " + n + " is: " + fact);
    }

}
