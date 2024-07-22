import java.util.*;
public class LinkedHasMap_Operation {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        //put
        map.put("China",150);
        map.put("India", 100);
        map.put("USA", 50);
        map.put("Pakistan", 25);
        map.put("Nepal",2);
        System.out.println(map);
        //get
        System.out.println(map.get("USA"));
        System.out.println(map.get("UAE"));
        //remove
        map.remove("Pakistan");
        System.out.println(map);
        System.out.println(map.isEmpty());
        //clear
        map.clear();
        System.out.println(map.isEmpty());
    }
}
