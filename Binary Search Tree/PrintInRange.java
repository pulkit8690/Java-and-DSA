
public class PrintInRange {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void printinRange(Node root, int k1, int k2)
    {
        if(root==null)
        {
            return;
        }
        if(root.data>=k1 && root.data<=k2)
        {
            printinRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printinRange(root.right, k1, k2);
        }
        else if(root.data<k1)
        {
            printinRange(root.left, k1, k2);
        }
        else{
            printinRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(35);

        int k1 = 10;
        int k2 = 30;

        System.out.println("Nodes within range " + k1 + " to " + k2 + ":");
        printinRange(root, k1, k2);
    }
}
