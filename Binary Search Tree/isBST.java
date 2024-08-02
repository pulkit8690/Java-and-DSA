public class isBST {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isbST(Node root)
    {
        return helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static boolean helper(Node root, int min, int max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.data<=min || root.data>=max)
        {
            return false;
        }
        return helper(root.left, min, root.data) && helper(root.right, root.data, max);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(25);

        if (isbST(root)) {
            System.out.println("The tree is a BST.");
        } else {
            System.out.println("The tree is not a BST.");
        }
    }
}

