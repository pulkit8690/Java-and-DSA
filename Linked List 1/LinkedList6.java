// Size of Linked list
/*
 public static int size;
 After Each New Node increase size by 1
 */
public class LinkedList6 {
    public static class Node6
    {
        int data;
        Node6 next;
        public Node6(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node6 head;
    public static Node6 tail;
    public static int size;
    public void AddFirst(int data)
    {
        //1. Create new Node
        Node6 newNode = new Node6 (data);
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
        Node6 newNode= new Node6 (data);
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
    public void print_ll()
    {
        Node6 temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int data, int index)
    {
        if(index==0)
        {
            AddFirst(data);
            return;
        }
        Node6 newNode= new Node6 (data);
        size++;
        Node6 temp=head;
        int i=0;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String[] args) {
        LinkedList6 ll =new LinkedList6();
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
    }
}
