//DEQUE-> Double Ended Queue
import java.util.Deque;
import java.util.LinkedList;
public class Deque_basics {
    public static void main(String[] args) {
        Deque<Integer> d1= new LinkedList<>();
        d1.addFirst(1);
        d1.addFirst(2);
        System.out.println(d1);
        d1.addLast(3);
        d1.addLast(4);
        System.out.println(d1);
        d1.removeFirst();
        System.out.println(d1);
        d1.removeLast();
        System.out.println(d1);
        System.out.println("First Element: "+d1.getFirst());
        System.out.println("Last Element: "+d1.getLast());
    }
}
