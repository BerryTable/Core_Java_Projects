package JavaCollections;

/**
 * Created by MamathaGangappa on 3/30/17.
 *
 * Example to deal with Array List Functions
 */

import java.util.*;

public class ArrayListExample {

        public static void main(String args[]) {
      /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
            ArrayList<String> obj = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
            obj.add("Ajeet");
            obj.add("Harry");
            obj.add("Chaitanya");
            obj.add("Steve");
            obj.add("Anuj");

	  /* Displaying array list elements */
            System.out.println("Currently the array list has following elements:"+obj);

	  /*Add element at the given index*/
            obj.add(0, "Rahul");
            obj.add(1, "Justin");

	  /*Remove elements from array list like this*/
            obj.remove("Chaitanya");
            obj.remove("Harry");

            System.out.println("Current array list is:"+obj);

	  /*Remove element from the given index*/
            obj.remove(1);

            System.out.println("Current array list is:"+obj);

            /* Element will be added at the end of the list */

            obj.add ("Mamatha");
            System.out.println("Current array is " + obj);

            obj.set (2,"Jobs");
            System.out.println("Current array list is " + obj);

            /* -1 is returned , if the element is not present in the list */

            System.out.println("Location of the element NOT present in the list  is " + obj.indexOf("gan"));


            /* Index position is returned if the element is present in the list */
            System.out.println("Location of the element present in the list " + obj.indexOf("Anuj"));

            /* To fetch the element in the specified index */
            System.out.println("Element at the index is " + obj.get(3));

            /* to fetch the size of the Array List */
            System.out.println("Array Size is " + obj.size());

            /* - obj.contains returns True if Object is present in the list
            Else returns false if Object is not present in the list
             */

            System.out.println("when element is not present  " + obj.contains("MG"));   // Returns False
            System.out.println("when element is present " + obj.contains("Anuj"));   // Returns True

            //obj.clear will remove all values form the list
            obj.clear();
            System.out.println("Objects in the list are"+ obj );


        }


    }


