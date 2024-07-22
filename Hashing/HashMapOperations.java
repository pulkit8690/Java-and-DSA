import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //put O(1)
        map.put("India", 100);
        map.put("USA", 50);
        map.put("China", 150);
        System.out.println(map);//  Maps are unordered thats is they print elements randomly
        System.out.println(map.size()); //3
        //Contains O(1)
        System.out.println(map.containsKey("India"));//true
        System.out.println(map.containsKey("UAE"));//false
        //GetKey O(1)
        System.out.println(map.get("India"));//100
        System.out.println(map.get("UAE"));//null
        //Remove O(1)
        map.remove("China");
        System.out.println(map);
        //IsEmpty O(1)
        System.out.println(map.isEmpty());
        //Clear Maps
        map.clear();
        System.out.println(map.isEmpty());
    }
}
