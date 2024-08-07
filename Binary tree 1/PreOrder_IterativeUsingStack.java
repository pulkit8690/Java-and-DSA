import java.util.ArrayList;
import java.util.Stack;

public class PreOrder_IterativeUsingStack {
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
        public ArrayList<Integer> PreOrder(Node root)
        {
            ArrayList<Integer> ans = new ArrayList<>();
            if(root==null)
            {
                return ans;
            }
            Stack<Node> s= new Stack<>();
            s.push(root);
            while(!s.isEmpty())
            {
                root=s.pop();
                ans.add(root.data);
                if(root.right!=null)
                {
                    s.push(root.right);
                }
                if(root.left!=null)
                {
                    s.push(root.left);
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root =tree.BuildTree(nodes);
        ArrayList<Integer> ans = tree.PreOrder(root);
        System.out.println(ans);
    }
}