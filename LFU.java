import java.util.*;

public class LFU {
    HashMap<Integer, Integer> values;
    HashMap<Integer, Integer> counts;
    HashMap<Integer, LinkedHashSet<Integer>> freqMap;
    int capacity;
    int minFreq;

    LFU(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        values = new HashMap<>();
        counts = new HashMap<>();
        freqMap = new HashMap<>();
        freqMap.put(1, new LinkedHashSet<>());
    }

    @SuppressWarnings("unused")
    public int get(int key) {
        if (!values.containsKey(key))
            return -1;
        int count = counts.get(key);
        counts.put(key, count + 1);
        freqMap.get(count).remove(key);
        if (count == minFreq && freqMap.get(count).isEmpty())
            minFreq++;
        freqMap.computeIfAbsent(count + 1, k -> new LinkedHashSet<>()).add(key);
        return values.get(key);
    }

    public void put(int key, int val) {
        if (capacity <= 0)
            return;
        if (values.containsKey(key)) {
            values.put(key, val);
            get(key);
            return;
        }
        if (values.size() == capacity) {
            int evict = freqMap.get(minFreq).iterator().next();
            freqMap.get(minFreq).remove(evict);
            values.remove(evict);
            counts.remove(evict);
        }
        values.put(key, val);
        counts.put(key, 1);
        freqMap.get(1).add(key);
        minFreq = 1;
    }

    public static void main(String[] args) {
        LFU lfu = new LFU(3); // Capacity is 3

        lfu.put(1, 10);
        lfu.put(2, 20);
        lfu.put(3, 30);

        System.out.println(lfu.get(1)); // Output: 10
        System.out.println(lfu.get(2)); // Output: 20

        lfu.put(4, 40); // Evicts key 3 (least frequently used)

        System.out.println(lfu.get(3)); // Output: -1 (not found)
        System.out.println(lfu.get(4)); // Output: 40
        System.out.println(lfu.get(1)); // Output: 10

        lfu.put(5, 50); // Evicts key 2

        System.out.println(lfu.get(2)); // Output: -1 (not found)
        System.out.println(lfu.get(5)); // Output: 50
    }
}
