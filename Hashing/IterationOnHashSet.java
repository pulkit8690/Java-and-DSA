import java.util.*;
public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("New Delhi");
        set.add("Noida");
        set.add("Bengaluru");
        set.add("Mumbai");
        @SuppressWarnings("rawtypes")

        //Using Iterator
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //Using enhanced for loop
        for(String city : set)
        {
            System.out.println(city);
        }
    }
}
