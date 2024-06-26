//Merge Sort O(nlogn)
/*
 public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Find Mid Node
        Node midNode = getMid(head);
        // Left and Right Merge Sort
        Node rightHead = midNode.next;
        midNode.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node merged_ll = new Node(-1);
        Node temp = merged_ll;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged_ll.next;
    }
 */
public class LinkedList4 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

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
    public void AddLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    /*********************** Add At Index i************************* */
    public void Add_Ati(int data, int index) {
        if (index == 0) {
            AddFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Find Mid Node
        Node midNode = getMid(head);
        // Left and Right Merge Sort
        Node rightHead = midNode.next;
        midNode.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node merged_ll = new Node(-1);
        Node temp = merged_ll;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged_ll.next;
    }

    public static void main(String[] args) {
        LinkedList4 ll= new LinkedList4();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(5);
        ll.print();
        LinkedList4.head=ll.mergeSort(LinkedList4.head);
        ll.print();

    }
}
