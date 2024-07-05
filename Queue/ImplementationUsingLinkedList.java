public class ImplementationUsingLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static class Queue{
        Node head=null;
        public boolean isEmpty()
        {
            return head==null;
        }
        public void add(int data)
        {
            Node newNode = new Node(data);
            if(head==null)
            {
                head=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue Empty");
                return -1;
            }
            if (isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q1= new Queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        while(!q1.isEmpty())
        {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
