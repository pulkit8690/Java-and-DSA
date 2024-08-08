public class ValidateBST {
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
    public static boolean isValid(Node root)
    {
        Node min=null;
        Node max=null;
        return helper(root,max,min);
    }
    public static boolean helper(Node root,Node min,Node max)
    {
        if(root==null)
        {
            return true;
        }
        if(min!=null && root.data<=min.data)
        {
            return false;
        }
        if(max!=null && root.data>=max.data)
        {
            return false;
        }
        return helper(root.left, min, root) && helper(root.right,root,max);
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        System.out.println("Is the given tree a valid BST? " + isValid(root));
        
        // Creating an invalid BST for testing
        Node invalidRoot = new Node(5);
        invalidRoot.left = new Node(3);
        invalidRoot.right = new Node(8);
        invalidRoot.left.left = new Node(2);
        invalidRoot.left.right = new Node(6);  // Invalid node

        System.out.println("Is the given tree a valid BST? " + isValid(invalidRoot));
    }
}
