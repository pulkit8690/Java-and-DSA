//Add First in Doubly LL
/*
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
 */
public class DLL1 {
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
        DLL1 d1 = new DLL1();
        d1.addFirst(5);
        d1.addFirst(4);
        d1.addFirst(3);
        d1.addFirst(2);
        d1.addFirst(1);
        d1.print();
    }

}
