import java.util.HashMap;

public class LRU {
    Node head=new Node(-1, -1);
    Node tail=new Node(-1, -1);
    HashMap<Integer,Node> map = new HashMap<>();
    int capacity;
    LRU(int capacity)
    {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    public int get(int key)
    {
        if(map.containsKey(key))
        {
            Node node= map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }else{
            return -1;
        }
    }
    public void remove(Node node)
    {
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insert(Node node)
    {
        map.put(node.key, node);
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
    }
    public void put(int key, int val)
    {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key, val));
    }
    public class Node{
        Node prev,next;
        int key, val;
        Node(int key, int val)
        {
            this.key=key;
            this.val=val;
        }
    }
    public static void main(String[] args) {
        LRU lruCache = new LRU(2); // Capacity of 2
        
        lruCache.put(1, 10); // Cache is {1=10}
        lruCache.put(2, 20); // Cache is {1=10, 2=20}
        
        System.out.println(lruCache.get(1)); // Returns 10
        
        lruCache.put(3, 30); // Removes key 2 and adds key 3, Cache is {1=10, 3=30}
        
        System.out.println(lruCache.get(2)); // Returns -1 (not found)
        
        lruCache.put(4, 40); // Removes key 1 and adds key 4, Cache is {4=40, 3=30}
        
        System.out.println(lruCache.get(1)); // Returns -1 (not found)
        System.out.println(lruCache.get(3)); // Returns 30
        System.out.println(lruCache.get(4)); // Returns 40
    }
    
}
