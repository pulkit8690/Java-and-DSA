// Add to Number 
//leetcode.com/problems/add-two-numbers/

public class LinkedList6 {
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
    public void addFirst(int data) {
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
    public Node Add_Sum(Node head1, Node head2)
    {
        Node temp1= head1;
        Node temp2= head2;
        Node dummy= new Node(-1);
        Node curr= dummy;
        int carry=0;
        while(temp1!=null || temp2!=null)
        {
            int sum=carry;
            if(temp1!=null)
            {
                sum=sum+temp1.data;
            }
            if(temp2!=null)
            {
                sum=sum+temp2.data;
            }
            Node newNode = new Node(sum%10);
            carry=sum/10;
            curr.next=newNode;
            curr=curr.next;
            if(temp1!=null)
            {
                temp1=temp1.next;
            }
            if(temp2!=null)
            {
                temp2=temp2.next;
            }
        }
        if(carry>0)
            {
                Node carr = new Node(carry);
                curr.next=carr;
            }
        return dummy.next;
    }
    public static void main(String[] args) {
        LinkedList6 list = new LinkedList6();

        // Adding elements to the list
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.addLast(5);

        // Print the list
        list.print();
        // Create two separate lists for summation
        LinkedList6 list1 = new LinkedList6();
        list1.addFirst(2);
        list1.addFirst(4);
        list1.addFirst(3);
        list1.print();
        LinkedList6 list2 = new LinkedList6();
        list2.addFirst(5);
        list2.addFirst(6);
        list2.addFirst(4);
        list2.print();

        // Add the two lists
        LinkedList6 result = new LinkedList6();
        result.head = list.Add_Sum(list1.head, list2.head);

        // Print the result list
        result.print();
    }
}
