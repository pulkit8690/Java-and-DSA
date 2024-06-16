/*
 1. Difference Between Array and ArrayList
        Array                     ArrayList
    - Fixed Size               - Dynamic Size
    - Primitive DataType       - Primitive DataType       
      can be Stored              cannot be Stored Directly

 2. ArrayList is part of Java Collection Framework.

 3. Operations on ArrayList
    - Add Element   O(1)
    - Get Element   O(1)
    - Remove Element O(1)
    - Set Element at Index O(n)
    - Contains Element O(n)
 */

//package ArrayList;
import java.util.*;
public class Creation {
    public static void main(String[] args) {
        // ClassName ObjectName=new ClassName()
        ArrayList<Integer> list1=new ArrayList<>();
        // ArrayList<Boolean> list2=new ArrayList<>();
        // ArrayList<Float> list3=new ArrayList<>();
        // ArrayList<String> list4=new ArrayList<>();

        // Add ELement
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(2,65);   //O(n)
        System.out.println(list1);

        // Get ELement
        // int element=list1.get(2);
        // System.out.println(element);

        //Remove Element
        // list1.remove(3);
        // System.out.println(list1);

        // Set Element at Index
        list1.set(2, 10);
        System.out.println(list1);

        //Contains Element
        System.out.println(list1.contains(2));
        System.out.println(list1.contains(11));
        
    }
}
