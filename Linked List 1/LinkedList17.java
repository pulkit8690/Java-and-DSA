

public class LinkedList17 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public LinkedList17() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /*********************** Print Link List************************* */
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /*********************** Add At First************************* */
    public void AddFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /*********************** Add At Last************************* */
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static Node removeDuplicate(Node head)
    {
        if(head==null)
        {
            return head;
        }
        Node dummy= new Node(-1);
        dummy.next=head;
        Node prev=dummy;
        Node curr=head;
        while(curr!=null)
        {
            if(curr.next != null && curr.data == curr.next.data)
            {
                curr=curr.next;
            }
            prev.next = curr.next;
            prev = prev.next;
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        LinkedList17 list = new LinkedList17();
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.print("Original list:");
        list.print();

        list.head = removeDuplicate(list.head);

        System.out.print("New list:");
        list.print();
    }
}
