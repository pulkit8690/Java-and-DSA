
//Diameter of Tree: Number of Nodes in Longest path between 2 leaves.
public class DiameterOfTree {
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
    public static int Height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh= Height(root.left);
        int rh= Height(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int Diameter1(Node root) //O(n^2)
    {
        if(root==null)
        {
            return 0;
        }
        int leftDiameter=Diameter1(root.left);
        int leftHeight=Height(root.left);
        int rightDiameter=Diameter1(root.right);
        int rightHeight=Height(root.right);
        int selfDiameter= leftHeight+rightHeight+1;
        return Math.max(selfDiameter,Math.max(rightDiameter, leftDiameter));
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left=new Node(6);
        root.right.right= new Node(7);
        System.out.println("Diameter of Tree is: "+Diameter1(root));
    }
}
