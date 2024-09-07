

public class LinkedList {
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
    /***********************remove Head************************* */
    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("Linked List is Empty");
            return Integer.MAX_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }
    /***********************Remove Last************************* */
    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int i=0;
        Node temp=head;
        while(i<size-2)
        {
            temp=temp.next;
            i++;
        }
        int val=temp.next.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }
    public static void main(String[] args) {
        LinkedList ll =new LinkedList ();
        ll.AddLast(2);
        ll.AddLast(1);
        ll.AddFirst(4);
        ll.AddFirst(5);
        System.out.print("Linked List: ");
        ll.print();
        System.out.println("Size of Linked List: "+size);
        int data=3;
        int index=2;
        System.out.print("After adding "+data+" at index "+index+": ");
        ll.Add_Ati(data,index);
        ll.print();;
        System.out.println("Size of Linked List: "+size);
        System.out.println("Deleting Head of Linked List");
        System.out.println("Value Deleted: "+ll.removeFirst());
        System.out.print("After removing Head: ");
        ll.print();
        System.out.println("Size of Linked List: "+size);

        System.out.println("Deleting Tail of Linked List");
        System.out.println("Value Deleted: "+ll.removeLast());
        System.out.print("After removing Tail: ");
        ll.print();
        System.out.println("Size of Linked List: "+size);
    }
}
