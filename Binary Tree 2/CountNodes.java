public class CountNodes {
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
    public static int CountNode(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lcount=CountNode(root.left);
        int rcount=CountNode(root.right);
        return lcount+rcount+1;
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left=new Node(6);
        root.right.right= new Node(7);
        System.out.println("Nodes in Tree are: "+CountNode(root));
    }
}
