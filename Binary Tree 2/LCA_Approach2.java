public class LCA_Approach2 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node lca2(Node root,int n1, int n2)
    {
        if(root==null || root.data==n1 || root.data==n2)
        {
            return root;
        }
        Node lcaLeft=lca2(root.left, n1, n2);
        Node lcaRight=lca2(root.right, n1, n2);
        if(lcaLeft==null)
        {
            return lcaRight;
        }
        if(lcaRight==null)
        {
            return lcaLeft;
        }
        return root;
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


        int n1= 4;
        int n2= 5;
        System.out.println(lca2(root, n1, n2).data);
    }
}
