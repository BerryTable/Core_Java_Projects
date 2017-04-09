package JavaCollections;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 * Created by MamathaGangappa on 3/30/17.
 */
public class combineArrayList_LinkedList {


    public static void main(String args[]) {

         /* Linked List Declaration - String */
        LinkedList<String> linkedlist = new LinkedList<String>();

         /* Linked List Declaration - Integer */
        LinkedList<Integer> integerlinkedlist = new LinkedList<Integer>();

       /* Add elements to linked list - String */
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");

       /* Add elements to linked list - Integer  */
        integerlinkedlist.add(11);
        integerlinkedlist.add(22);
        integerlinkedlist.add(33);
        System.out.println("Integer linked list " + integerlinkedlist);


        /* Array List declaration and adding elements - String */
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ajeet");
        arrayList.add("Harry");
        arrayList.add("Chaitanya");


         /* Array List declaration and adding elements - Int */
        ArrayList<Integer> arrayIntegers = new ArrayList<Integer>();
        arrayIntegers.add(1);
        arrayIntegers.add(2);
        arrayIntegers.add(3);

        //Display the array list elements
        System.out.println("New Array list of integers is " + arrayIntegers);
        System.out.println("Array list contains items " + arrayList);

        //Display the Linked list elements
        System.out.println("Linked List Content String  " + linkedlist);
        System.out.println("Linked List content - Integer  " + integerlinkedlist);



        /*IMPORTANT
        Integer list can be combined only with Integer Array
        String List can be combined only with String Array */

        integerlinkedlist.addAll(arrayIntegers);
        System.out.println("Combined integer list " + integerlinkedlist);

        linkedlist.addAll(arrayList);
        System.out.println("Combined string list " + linkedlist);

        linkedlist.addAll(2,arrayList);
        System.out.println("Combined string list " + linkedlist);

        /* The below two combinations will not work and will throw error
        integerlinkedlist.addAll(arrayList);
        linkedlist.addAll(arrayIntegers) */


    }

}
