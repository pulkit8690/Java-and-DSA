// Add Last in DLL
/*
 public void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=null;
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
 */

public class DLL2 {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=null;
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public void print() {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DLL2 d1= new DLL2();
        d1.addLast(1);
        d1.addLast(2);
        d1.addLast(3);
        d1.addLast(4);
        d1.print();
    }
}
