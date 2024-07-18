public class MaxPathSum {
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
    public static int MaxSum(Node root)
    {
        int[] max_val = new int[1];
        max_val[0]= Integer.MIN_VALUE;
        helper(root,max_val);
        return max_val[0];
    }
    public static int helper(Node root, int[] max_val)
    {
            if(root==null)
            {
                return 0;
            }
            int lsum=Math.max(0,helper(root.left, max_val));
            int rsum=Math.max(0,helper(root.right, max_val));
            max_val[0]=Math.max(max_val[0], lsum+rsum+root.data);
            return Math.max(lsum, rsum)+root.data;
    }
    public static void main(String[] args) {
         /*
                             1
                            / \
                           2   3
                          / \ / \
                         4  5 6  7

         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int maxPathSum = MaxSum(root);
        System.out.println("Maximum Path Sum: " + maxPathSum);//18
    }
}
