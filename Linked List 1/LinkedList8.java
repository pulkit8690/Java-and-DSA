// Remove Tail
/*

 public int removeLast()
    {
        if(size==0)
        {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int i=0;
        Node prev=head;
        while(i<size-2)
        {
            prev=prev.next;
            i++;
        }
        int val= prev.next.data; // or tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }
 */
public class LinkedList8 {
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
    public static int size;
    public void AddFirst(int data)
    {
        //1. Create new Node
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        //2. link new Node with head
        newNode.next=head;
        //3. make newNode as head
        head=newNode;
    }
    public void AddLast(int data)
    {
        //1. Create New Node
        Node newNode= new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        //2.
        tail.next=newNode;
        //3
        tail=newNode;
    }
    public void add(int data, int index)
    {
        if(index==0)
        {
            AddFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("Linked List is Empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int i=0;
        Node prev=head;
        while(i<size-2)
        {
            prev=prev.next;
            i++;
        }
        int val= prev.next.data; // or tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }
    public void print_ll()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        LinkedList8 ll =new LinkedList8();
        ll.AddLast(2);
        ll.AddLast(1);
        ll.AddFirst(4);
        ll.AddFirst(5);
        System.out.print("Linked List: ");
        ll.print_ll();
        System.out.println("Size of Linked List: "+size);
        int data=3;
        int index=2;
        System.out.print("After adding "+data+" at index "+index+": ");
        ll.add(data,index);
        ll.print_ll();;
        System.out.println("Size of Linked List: "+size);
        System.out.println("Deleting Head of Linked List");
        System.out.println("Value Deleted: "+ll.removeFirst());
        System.out.print("After removing Head: ");
        ll.print_ll();
        System.out.println("Size of Linked List: "+size);

        System.out.println("Deleting Tail of Linked List");
        System.out.println("Value Deleted: "+ll.removeLast());
        System.out.print("After removing Tail: ");
        ll.print_ll();
        System.out.println("Size of Linked List: "+size);
    }
}
