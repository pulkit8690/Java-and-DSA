// O(N)
public class PreOrderTraversal {
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
    public static class BinaryTree{
        static int idx=-1;
        public  Node BuildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;
        }
        public void PreOrder(Node root)
        {
            if(root==null)
            {
                return;
            }
            System.out.print(root.data+" ");
            PreOrder(root.left);
            PreOrder(root.right);
        }

    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root =tree.BuildTree(nodes);
        tree.PreOrder(root);
    }
}
