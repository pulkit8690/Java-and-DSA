import java.util.LinkedList;
import java.util.*;
public class Interleave2Halves {
    public static Queue<Integer> interleave(Queue<Integer> q)
    {
        int size=q.size();
        Queue<Integer> first = new LinkedList<>();
        for(int i=0;i<size/2;i++)
        {
            first.add(q.remove());
        }
        while(!first.isEmpty())
        {
            q.add(first.remove());
            q.add(q.remove());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(interleave(q));
    }
}
