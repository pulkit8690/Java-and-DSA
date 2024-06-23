// Add Element in the linked list from tail/Last
/*
 public void AddLast(int data) //O(1)
    {
        //1. Create New Node
        Node newNode= new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        //2. tail ka next ko new Node se link
        tail.next=newNode;
        //3. make new Node as tail
        tail=newNode;
    }
 */
public class LinkedList3 {
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void AddLast(int data) //O(1)
    {
        //1. Create New Node
        Node newNode= new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        //2. tail ka next ko new Node se link
        tail.next=newNode;
        //3. make new Node as tail
        tail=newNode;
    }
    public static void main(String[] args) {
        LinkedList3 ll =new LinkedList3();
        ll.AddLast(2);
        ll.AddLast(1);
        ll.AddLast(4);
        ll.AddLast(5);
        // ll =>   2->1->4->5
    }
}
