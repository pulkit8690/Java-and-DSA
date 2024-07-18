public class BalancedBinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int check_Balanced(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=check_Balanced(root.left);
        if(lh==-1) return -1; //Not Balanced
        int rh=check_Balanced(root.right);
        if(rh==-1) return -1; //Not Balanced
        if(Math.abs(rh-lh)>1) return -1;
        return Math.max(lh, rh)+1;
    }
    public static void main(String[] args) {
        // Balanced binary tree
        /*
                             1
                            / \
                           2   3
                          / \ / \
                         4  5 6  7

         */
        Node balancedRoot = new Node(1);
        balancedRoot.left = new Node(2);
        balancedRoot.right = new Node(3);
        balancedRoot.left.left = new Node(4);
        balancedRoot.left.right = new Node(5);
        balancedRoot.right.left = new Node(6);
        balancedRoot.right.right = new Node(7);
        
        // Unbalanced binary tree
        /*
                                 1
                                /
                              2
                             /
                           3
                          /
                        4

         */
        Node unbalancedRoot = new Node(1);
        unbalancedRoot.left = new Node(2);
        unbalancedRoot.left.left = new Node(3);
        unbalancedRoot.left.left.left = new Node(4);
        
        if (check_Balanced(balancedRoot) != -1) {
            System.out.println("Balanced Binary Tree.");
        } else {
            System.out.println("Unbalanced Binary Tree.");
        }
        
        if (check_Balanced(unbalancedRoot) != -1) {
            System.out.println("Balanced Binary Tree.");
        } else {
            System.out.println("Unbalanced Binary Tree.");
        }
    }
}
