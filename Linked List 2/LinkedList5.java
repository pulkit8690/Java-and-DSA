// Zig Zig LL
//Original LL:  1->2->3->4->5->null
// Zig Zig LL:  1->5->2->4->3->null
/*
 public void ZigZag(Node head)
    {
        //Step 1 Find Mid
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        Node midNode =slow;
        //Step 2 Reverse 2nd Half
        Node prev=null;
        Node curr=midNode.next;
        midNode.next=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left!=null && right!=null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            
            left=nextL;
            right=nextR;
        }

    }
 */
public class LinkedList5 
{
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
    
    public void rev_ll()
    {
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void ZigZag(Node head)
    {
        //Step 1 Find Mid
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        Node midNode =slow;
        //Step 2 Reverse 2nd Half
        Node prev=null;
        Node curr=midNode.next;
        midNode.next=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left!=null && right!=null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            
            left=nextL;
            right=nextR;
        }

    }
    public void AddLast(int data) //O(1)
    {
        //1. Create New Node
        Node newNode= new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        //2. tail ka next ko new Node se link
        tail.next=newNode;
        //3. make new Node as tail
        tail=newNode;
    }
    public static void main(String[] args) {
        LinkedList5 ll=new LinkedList5();
        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.print();
        ll.ZigZag(head);
        ll.print();
    }
}
