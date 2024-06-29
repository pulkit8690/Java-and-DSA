// reverse a Doubly Linked List
/*
 public void reverse()
    {
        if(head==null || head.next==null)
        {
            return;
        }
        Node curr=head;
        Node last=null;
        while(curr!=null)
        {
            last=curr.back;
            curr.back=curr.next;
            curr.next=last;
            curr=curr.back;
        }
        head=last.back;
    }
 */

public class DLL7 {
    public static class Node{
        int data;
        Node next;
        Node back;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.back=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=null;
        tail.next=newNode;
        newNode.back=tail;
        tail=newNode;
    }
    public void addFirst(int data) {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        newNode.back=null;
        head.back=newNode;
        head=newNode;
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
    public void reverse()
    {
        if(head==null || head.next==null)
        {
            return;
        }
        Node curr=head;
        Node last=null;
        while(curr!=null)
        {
            last=curr.back;
            curr.back=curr.next;
            curr.next=last;
            curr=curr.back;
        }
        head=last.back;
    }
    public static void main(String[] args) {
        DLL7 d1= new DLL7();
        d1.addLast(1);
        d1.addLast(2);
        d1.addLast(3);
        d1.addLast(4);
        d1.print();
        d1.reverse();
        d1.print();
    }
}
