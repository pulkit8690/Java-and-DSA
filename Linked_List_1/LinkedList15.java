package Linked_List_1;
//Odd Even Linked List
//https://leetcode.com/problems/odd-even-linked-list/
 /* 
    // Brute Force
    // TC: O(2n)
    // SC: O(n)
    public static Node OddEven(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node temp=head;
        ArrayList<Integer> ans= new ArrayList<>();
        while(temp!=null && temp.next!=null)
        {
            ans.add(temp.data);
            temp=temp.next.next;
        }
        if(temp!=null)
        {
            ans.add(temp.data);
        }
        temp=head.next;
        while(temp!=null && temp.next!=null)
        {
            ans.add(temp.data);
            temp=temp.next.next;
        }
        if(temp!=null)
        {
            ans.add(temp.data);
        }
        temp=head;
        for(int i=0;i<ans.size();i++)
        {
            temp.data=ans.get(i);
            temp=temp.next;
        }
        return head;
    }
    */

/* 
    //Optimal Soln
    // TC= O(N)
    // SC= O(1)
    public static Node OddEven(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node odd= head;
        Node even=head.next;
        Node evenHead=head.next;
        while(even!=null && even.next!=null)
        {
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
        */
//import java.util.ArrayList;

public class LinkedList15 {
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
    public LinkedList15() {
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
    public void addLast(int data)
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

    /* 
    // Brute Force
    // TC: O(2n)
    // SC: O(n)
    public static Node OddEven(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node temp=head;
        ArrayList<Integer> ans= new ArrayList<>();
        while(temp!=null && temp.next!=null)
        {
            ans.add(temp.data);
            temp=temp.next.next;
        }
        if(temp!=null)
        {
            ans.add(temp.data);
        }
        temp=head.next;
        while(temp!=null && temp.next!=null)
        {
            ans.add(temp.data);
            temp=temp.next.next;
        }
        if(temp!=null)
        {
            ans.add(temp.data);
        }
        temp=head;
        for(int i=0;i<ans.size();i++)
        {
            temp.data=ans.get(i);
            temp=temp.next;
        }
        return head;
    }
    */


    //Optimal Soln
    // TC= O(N)
    // SC= O(1)
    public static Node OddEven(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node odd= head;
        Node even=head.next;
        Node evenHead=head.next;
        while(even!=null && even.next!=null)
        {
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
    
    public static void main(String[] args) {
        LinkedList15 list = new LinkedList15();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.print("Original list:");
        list.print();

        list.head = OddEven(list.head);

        System.out.print("Odd-Even rearranged list:");
        list.print();
    }
}
