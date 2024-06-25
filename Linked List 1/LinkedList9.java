// Search element in linked list iterative way or linear search
/*

 public int search(int key)
    {
        int i=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }
 */


public class LinkedList9 {
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
    /***********************Search element iteratively************************* */
    public int search(int key)
    {
        int i=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinkedList9 ll =new LinkedList9 ();
        ll.AddLast(2);
        ll.AddLast(1);
        ll.AddFirst(4);
        ll.AddFirst(5);
        System.out.print("Linked List: ");
        ll.print();
        int key=4;
        System.out.println(key+" is present at index "+ll.search(key));
        System.out.println("10 is present at index "+ll.search(10));
    }
}
