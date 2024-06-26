import java.util.*;

public class LinkedList3 
{
    public static void main(String[] args) {
        //Creation
        LinkedList<Integer> ll=new LinkedList<>();
        //Add ELement
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //Print
        System.out.println(ll);
        //Remove Element
        ll.removeLast();
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
    }
}
