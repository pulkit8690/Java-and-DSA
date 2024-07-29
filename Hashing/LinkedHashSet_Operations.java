/*
 Implemented usig Linked HashMap
 */
import java.util.*;
public class LinkedHashSet_Operations {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("New Delhi");
        set.add("Noida");
        set.add("Bengaluru");
        set.add("Mumbai");
        System.out.println(set);
        System.out.println(set.size());
        set.remove("Mumbai");
        System.out.println(set);
        System.out.println(set.isEmpty());

    }
}
