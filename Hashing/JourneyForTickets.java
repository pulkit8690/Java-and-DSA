
import java.util.*;
public class JourneyForTickets {
    public static String start(HashMap<String,String> tickets)
    {
        HashMap<String,String> revMap= new HashMap<>();
        for(String key: tickets.keySet())
        {
            revMap.put(tickets.get(key),key);
        }
        for(String key : tickets.keySet())
        {
            if(!revMap.containsKey(key))
            {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");
        String start= start(map);
        System.out.print(start);
        for(String key : map.keySet())
        {
            System.out.print("->"+map.get(start));
            start=map.get(start);
        }
    }
}
