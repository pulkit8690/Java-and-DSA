/*
 No Duplicates
 Unordered
 Null is Allowed
 Implemented Using HashMap
 */
import java.util.*;
public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        // Add
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(2);
        System.out.println(set);

        //Contains(Key)
        if(set.contains(2))
        {
            System.out.println("Set contains 2");
        }else{
            System.out.println("Set not contains 2");
        }
        if(set.contains(3))
        {
            System.out.println("Set contains 3");
        }else{
            System.out.println("Set not contains 3");
        }

        // remove
        set.remove(2);
        System.out.println(set);
        //size
        System.out.println(set.size());
        //clear
        set.clear();
        System.out.println(set.isEmpty());
    }
}
