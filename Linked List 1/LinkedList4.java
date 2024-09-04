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
    public static class Node4
    {
        int data;
        Node4 next;
        public Node4(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node4 head;
    public static Node4 tail;
    public void AddLast(int data) //O(1)
    {
        //1. Create New Node
        Node4 newNode= new Node4 (data);
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
        Node4 temp=head;
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
