package JavaCollections;
import java.util.*;

/**
 * Created by MamathaGangappa on 3/30/17.
 */
public class LinkedListExample {



        public static void main(String args[]) {

         /* Linked List Declaration */
            LinkedList<String> linkedlist = new LinkedList<String>();



         /*add(String Element) is used for adding
          * the elements to the linked list*/
            linkedlist.add("Item1");
            linkedlist.add("Item5");
            linkedlist.add("Item3");
            linkedlist.add("Item6");
            linkedlist.add("Item2");
            //linkedlist.add("Item3");

            System.out.println("List is " + linkedlist);
            System.out.println("Item repeated at position" +linkedlist.lastIndexOf("Item3"));

            System.out.println("First Item removed and retured - usage of POLL :  " + linkedlist.poll());
            System.out.println("List is " + linkedlist);

            System.out.println("Item removed and  - usage of POLL :  " + linkedlist.pollFirst());
            System.out.println("List is " + linkedlist);

            System.out.println("Item removed and  - usage of POLL : " + linkedlist.pollLast());
            System.out.println("List is " + linkedlist);




         /*Display Linked List Content*/
            System.out.println("Linked List Content: " +linkedlist);



         /*Add First and Last Element*/
            linkedlist.addFirst("First Item");
            linkedlist.addLast("Last Item");
            System.out.println("LinkedList Content after addition: " +linkedlist);

         /*This is how to get and set Values*/
            Object firstvar = linkedlist.get(0);
            System.out.println("First element: " +firstvar);
            linkedlist.set(0, "Changed first item");
            Object firstvar2 = linkedlist.get(0);
            System.out.println("First element after update by set method: " +firstvar2);

         /*Remove first and last element*/
            linkedlist.removeFirst();
            linkedlist.removeLast();
            System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

         /* Add to a Position and remove from a position*/
            linkedlist.add(0, "Newly added item");
            linkedlist.remove(2);
            System.out.println("Final Content: " +linkedlist);
        }
    }


