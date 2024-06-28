public class DLL3 {
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
    public void addFirst(int data) {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        newNode.prev=null;
        head.prev=newNode;
        head=newNode;
    }
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
    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("Doubly Linked is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val= head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;

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
        DLL3 d1 =new DLL3();
        d1.addLast(2);
        d1.addLast(1);
        d1.addFirst(4);
        d1.addFirst(5);
        System.out.print("Linked List: ");
        d1.print();
        System.out.println("Size of Linked List: "+size);
        System.out.println("Deleting Head of Linked List");
        System.out.println("Value Deleted: "+d1.removeFirst());
        System.out.print("After removing Head: ");
        d1.print();
        System.out.println("Size of Linked List: "+size);
    }
}
