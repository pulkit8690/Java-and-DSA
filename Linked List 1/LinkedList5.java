// Add Element at index i
/*
 public void add(int data, int index)
    {
        if(index==0)
        {
            AddFirst(data);
            return;
        }
        Node newNode= new Node(data);
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
 */

public class LinkedList5 {
    public static class Node5
    {
        int data;
        Node5 next;
        public Node5 (int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node5 head;
    public static Node5 tail;
    public void AddFirst(int data)
    {
        //1. Create new Node
        Node5 newNode = new Node5 (data);
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
        Node5 newNode= new Node5 (data);
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
        Node5 temp=head;
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
        Node5 newNode= new Node5 (data);
        Node5 temp=head;
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
        LinkedList5 ll =new LinkedList5();
        ll.AddLast(2);
        ll.AddLast(1);
        ll.AddLast(4);
        ll.AddLast(5);
        System.out.print("Linked List: ");
        ll.print_ll();
        int data=7;
        int index=2;
        System.out.print("After adding "+data+" at index "+index+": ");
        ll.add(data,index);
        ll.print_ll();;
    }
}
