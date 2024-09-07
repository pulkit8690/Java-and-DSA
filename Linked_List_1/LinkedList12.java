package Linked_List_1;
// Find and Remove nth Node from end
/*
 public void delete_nth_from_end(int n)
    {
        //Calculating Size
        int sz=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            sz++;
        }
        //Removing Head
        if(n==sz) 
        {
            head=head.next;
            return;
        }
        Node prev=head;
        int i=1;
        while(i<(sz-n))
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

    }
 */
public class LinkedList12 {
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
    public static int size;
    /***********************Print Link List************************* */
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    /***********************Add At First************************* */
    public void AddFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    /***********************Add At Last************************* */
    public void AddLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    /***********************Add At Index i************************* */
    public void Add_Ati(int data, int index)
    {
        if(index==0)
        {
            AddFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        int i=0;
        Node temp=head;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void delete_nth_from_end(int n)
    {
        //Calculating Size
        int sz=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            sz++;
        }
        //Removing Head
        if(n==sz) 
        {
            head=head.next;
            return;
        }
        Node prev=head;
        int i=1;
        while(i<(sz-n))
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

    }
    public static void main(String[] args) {
        LinkedList12 ll =new LinkedList12 ();
        ll.AddLast(2);
        ll.AddLast(1);
        ll.AddFirst(4);
        ll.AddFirst(5);
        System.out.print("Linked List: ");
        ll.print();
        ll.delete_nth_from_end(2);
        System.out.print("Linked List: ");
        ll.print();

    }
}
