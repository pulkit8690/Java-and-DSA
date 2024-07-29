import java.util.*;
public class TreeSet_Operation {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
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
