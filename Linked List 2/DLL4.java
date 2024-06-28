public class DLL4 {
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
    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("Linked List is empty");
            return Integer.MAX_VALUE;
        }
        if(size==1)
        {
            int val=tail.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node temp=head;
        int i=0;
        while(i<(size-2))
        {
            temp=temp.next;
            i++;
        }
        int val= temp.next.data;
        temp.next=null;
        tail=temp;
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
        DLL4 ll =new DLL4();
        ll.addLast(2);
        ll.addLast(1);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.print("Linked List: ");
        ll.print();
        System.out.println("Size of Linked List: "+size);
        System.out.println("Deleting Tail of Linked List");
        System.out.println("Value Deleted: "+ll.removeLast());
        System.out.print("After removing Tail: ");
        ll.print();
        System.out.println("Size of Linked List: "+size);
    }
}
