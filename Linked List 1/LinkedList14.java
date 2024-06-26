//https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/
public class LinkedList14 {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;
    public int size;
    public LinkedList14() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
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
    public int getKthFromLast(int k)
    {
        int n=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            n++;
        }
        System.out.println(n);
        if(k>n)
        {
            return -1;
        }
        if(k==n)
        {
            return head.data;
        }
        int i=1;
        Node prev=head;
        while(i<(n-k))
        {
            prev=prev.next;
            i++;
        }
        return prev.next.data;
    }
    public static void main(String[] args) {
        LinkedList14 ll =new LinkedList14 ();
        ll.AddLast(23);
        ll.AddLast(89);
        ll.AddLast(50);
        ll.AddLast(30);
        ll.AddLast(72);
        
        ll.print();
        System.out.println(ll.getKthFromLast(5));
    }
}
