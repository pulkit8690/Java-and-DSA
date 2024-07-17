import java.util.ArrayList;
import java.util.Stack;

public class InOrder_IterativeUsingStack {
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
        public ArrayList<Integer> Inorder(Node root)
        {
            ArrayList<Integer> ans = new ArrayList<>();
            if(root==null)
            {
                return ans;
            }
            Stack<Node> s= new Stack<>();
            Node curr= root;
            while(true)
            {
                if(curr!=null)
                {
                    s.push(curr);
                    curr=curr.left;
                }
                else{
                    if(s.isEmpty())
                    {
                        break;
                    }
                    curr=s.pop();
                    ans.add(curr.data);
                    curr=curr.right;
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root =tree.BuildTree(nodes);
        ArrayList<Integer> ans = tree.Inorder(root);
        System.out.println(ans);
    }
}
