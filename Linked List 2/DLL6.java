public class DLL6 {
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
    public void print() {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
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
    public void remove_ati(int index)
    {
        if (index==0) {
            removeFirst();
            return;
        }
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
        size--;
    }
    public static void main(String[] args) {
        DLL6 ll =new DLL6();
        ll.addLast(2);
        ll.addLast(1);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.print("Linked List: ");
        ll.print();
        System.out.println("Size of Linked List: "+size);
        System.out.println("Deleting element of Linked List");
        ll.remove_ati(2);
        System.out.print("After removing : ");
        ll.print();
        System.out.println("Size of Linked List: "+size);
    }
}
