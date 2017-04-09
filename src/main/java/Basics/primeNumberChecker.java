package Basics;

/**
 * Created by MamathaGangappa on 4/5/17.
 */
public class primeNumberChecker {
    public Boolean validate(final Integer primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        primeNumberChecker pm = new primeNumberChecker();
        System.out.println(pm.validate(7));

    }

}