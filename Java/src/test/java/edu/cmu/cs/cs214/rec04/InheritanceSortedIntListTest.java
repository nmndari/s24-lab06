package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the InheritanceSortedIntList class.
 *
 * @author Nora Shoemaker
 *
 */
public class InheritanceSortedIntListTest {

    /** 
     * Uncomment the following code to test your implementation 
     * Select all and (CTRL + /) or (COMMAND + /)
     * Feel free to write more tests for your implementation. */

     private InheritanceSortedIntList list1;
     private InheritanceSortedIntList list2;

     /**
      * Called before each test.
      */
     @Before
     public void setUp() {
     list1 = new InheritanceSortedIntList();
     list2 = new InheritanceSortedIntList();
     }

     /**
      * Tests for the add() method.
      */
     @Test
     public void testAdd() {
     // add 5 elements to our list.
     list1.add(1);
     list1.add(3);
     list1.add(2);
     list1.add(4);
     list1.add(2);
     System.out.println(list1.getTotalAdded());
     // check that the total number of elements added is 5.
         assertEquals(5, list1.getTotalAdded());
     printList(list1);
     }

     /**
      * Tests for the addAll() method.
      */
     @Test
     public void testAddAll() {
      InheritanceSortedIntList list1 = new InheritanceSortedIntList();
      InheritanceSortedIntList list2 = new InheritanceSortedIntList();

      // Add elements to list1
      list1.add(1);
      list1.add(2);
      list1.add(3);
      list1.add(4);
      list1.add(5);
      list1.add(6);
      list1.add(7);

      // Add all elements from list1 to list2
      list2.addAll(list1);

      // Check that the total number of elements added to list2 is 7
      assertEquals(7, list2.getTotalAdded());
     }

     /**
      * A helper function that prints out the contents of an IntegerList.
      * @param list IntegerList to be printed out.
      */
     private void printList(IntegerList list) {
     for (int i = 0; i < list.size(); i++) {
     System.out.print(list.get(i));
     System.out.print(", ");
     }
     System.out.println();
     }
}