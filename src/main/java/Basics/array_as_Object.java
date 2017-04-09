package Basics;


/**
 * Created by MamathaGangappa on 4/3/17.
 */
public class array_as_Object {
    public static void main(String[] args) {
        Object arr[] = new Object[4];
        arr[0]= 1;
        arr[1]= "MG";
        arr[2]= true;
        arr[3]="yes.com";
        for (int i=0; i< arr.length;i++)
        System.out.println(arr[i]);
    }
}
