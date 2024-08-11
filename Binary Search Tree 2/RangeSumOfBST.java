public class RangeSumOfBST {
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
    public static int RangeSum(Node root, int low, int high)
    {
        if(root==null)
        {
            return 0;
        }
        int sum=0;
        if(root.data>=low && root.data<=high)
        {
            sum+=root.data;
        }if(root.data>low)
        {
            sum+=RangeSum(root.left, low, high);
        }if(root.data<high){
            sum+=RangeSum(root.right, low, high);
        }
        return sum;
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

        System.out.println("Nodes within range Sum " + k1 + " to " + k2 + ":"+ RangeSum(root, k1, k2));
    }
}
