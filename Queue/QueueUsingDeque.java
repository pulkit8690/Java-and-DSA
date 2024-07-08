import java.util.LinkedList;
import java.util.Deque;
public class QueueUsingDeque {
    public static class Queue{
        Deque<Integer> d1= new LinkedList<>();
        public void add(int data)
        {
            d1.addLast(data);
        }
        public int remove()
        {
            return d1.removeFirst();
        }
        public int peek()
        {
            return d1.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek: "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
