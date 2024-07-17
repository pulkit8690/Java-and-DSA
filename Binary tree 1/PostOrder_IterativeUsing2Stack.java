import java.util.*;

public class PostOrder_IterativeUsing2Stack {
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
        public ArrayList<Integer> Postorder(Node root)
        {
            ArrayList<Integer> ans = new ArrayList<>();
            if(root ==null)
            {
                return ans;
            }
            Stack<Node> s1 = new Stack<Node>();
            Stack<Node> s2= new Stack<Node>();
            s1.push(root);
            while(!s1.isEmpty())
            {
                root=s1.pop();
                s2.add(root);
                if(root.left!=null) s1.push(root.left);
                if(root.right!=null) s1.push(root.right);
            }
            while(!s2.isEmpty())
            {
                ans.add(s2.pop().data);
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root =tree.BuildTree(nodes);
        ArrayList<Integer> ans = tree.Postorder(root);
        System.out.println(ans);
    }
}
