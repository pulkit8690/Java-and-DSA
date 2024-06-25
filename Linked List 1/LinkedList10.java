// Search element Recursively 
// TC: O(n)   SC:O(n)
/*
 public int helper(Node head, int key)
    {
        //Base Case
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        // kaam
        int index=helper(head.next, key);
        if(index==-1)
        {
            return -1;
        }
        return index+1;
    }
    public int rec_search(int key)
    {
        return helper(head,key);
    }
 */

public class LinkedList10 {
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
/***********************Search element Recursively************************* */
   
    public int helper(Node head, int key) // TC: O(n)   SC:O(n)
    {
        //Base Case
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        // kaam
        int index=helper(head.next, key);
        if(index==-1)
        {
            return -1;
        }
        return index+1;
    }
    public int rec_search(int key)
    {
        return helper(head,key);
    }
    public static void main(String[] args) {
        LinkedList10 ll =new LinkedList10 ();
        ll.AddLast(2);
        ll.AddLast(1);
        ll.AddFirst(4);
        ll.AddFirst(5);
        System.out.print("Linked List: ");
        ll.print();
        System.out.println("2 is present at index "+ll.rec_search(2));
        System.out.println("10 is present at index "+ll.rec_search(10));
    }
}
