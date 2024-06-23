// Printing the Linked list
/*
 public void print_ll() //O(n)
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
 */
public class LinkedList4 {
    public static class Node
    {
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
    public void print_ll() //O(n)
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList4 ll =new LinkedList4();
        ll.print_ll();
        ll.AddLast(2);
        ll.print_ll();
        ll.AddLast(1);
        ll.print_ll();
        ll.AddLast(4);
        ll.print_ll();
        ll.AddLast(5);
        ll.print_ll();
    }
}
