// Removing a Cycle in LL

public class LinkedList2 {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static boolean isCycle()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    public static void removeCycle()
    {
        //Detect Cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                cycle=true;
                break;
            }
        }
        if(cycle==false)
        {
            return;
        }
        //Find Meeting Point
        slow=head;
        Node prev=null;
        while(slow!=fast)
        {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;

    }

    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
