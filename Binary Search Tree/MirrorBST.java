public class MirrorBST {
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
    public static Node mirrorBST(Node root)
    {
        if(root==null)
        {
            return null;
        }
        Node leftMirror= mirrorBST(root.left);
        Node rightMirror=mirrorBST(root.right);
        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }
    public static void Preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Original Tree (Preorder):");
        Preorder(root);
        System.out.println();

        Node mirroredRoot = mirrorBST(root);

        System.out.println("Mirrored Tree (Preorder):");
        Preorder(mirroredRoot);
        System.out.println();
    }
}
