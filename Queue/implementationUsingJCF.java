import java.util.*;
public class implementationUsingJCF {
    public static void main(String[] args) {
        Queue<Integer> q= new ArrayDeque<>(); // or LinkedList
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}

// Queue is a interface so we can't create its object due to to which we implement queue using LinkedList or ArrayDeque;

