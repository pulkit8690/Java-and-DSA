public class DLL5 {
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
    public void addAti(int data, int index)
    {
        if(index==0)
        {
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        newNode.next=temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }
}
