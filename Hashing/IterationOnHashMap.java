
import java.util.*;
public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("China",150);
        hm.put("India", 100);
        hm.put("USA", 50);
        hm.put("Pakistan", 25);
        hm.put("Nepal",2);
        Set<String>  keys = hm.keySet();
        for (String k : keys) {
            System.out.println("Key= "+k+" , Value="+hm.get(k));
        }
    }
}
//keySet is use to store keys;
//entrySet is use to store Values;