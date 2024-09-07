package Linked_List_1;
// palindrome linked list
/*
 public Node Mid_Element(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;
    }
    public boolean check_palindrome()
    {
        if(head==null || head.next==null)
        {
            return true;
        }
        //Step 1 Find Mid
        Node midNode= Mid_Element(head);
        //Step 2 Reverse Second Half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        // Step 3 Check right and left part
        Node right=prev;
        Node left=head;
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
 */

public class LinkedList13 {
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
    public LinkedList13() {
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
    public Node Mid_Element(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;
    }
    public boolean check_palindrome()
    {
        if(head==null || head.next==null)
        {
            return true;
        }
        //Step 1 Find Mid
        Node midNode= Mid_Element(head);
        //Step 2 Reverse Second Half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        // Step 3 Check right and left part
        Node right=prev;
        Node left=head;
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList13 ll =new LinkedList13 ();
        ll.AddLast(2);
        ll.AddLast(1);
        ll.AddFirst(2);
        ll.AddFirst(1);
        LinkedList13 ll1 =new LinkedList13 ();
        ll1.AddLast(1);
        ll1.AddLast(2);
        ll1.AddFirst(3);
        ll1.AddFirst(4);
        LinkedList13 ll2 =new LinkedList13 ();
        ll2.AddFirst(4);
        System.out.print("Linked List: ");
        ll.print();
        System.out.println(ll.check_palindrome());
        ll1.print();
        System.out.println(ll1.check_palindrome());
        ll2.print();
        System.out.println(ll2.check_palindrome());
    }
}
