// Add Element in the linked list from head/first
/*
 public void AddFirst(int data) {   // O(1)
        // 1. Creation of New Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // 2. newNode ka next pointing to next of head
        newNode.next = head;
        // 3. Make newNode as head
        head = newNode;
    }
 */

public class LinkedList2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void AddFirst(int data) {   // O(1)
        // 1. Creation of New Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // 2. newNode ka next pointing to next of head
        newNode.next = head;
        // 3. Make newNode as head
        head = newNode;
    }

    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddFirst(4);
        ll.AddFirst(5);
        // ll==> 5->4->1->2
    }
}
