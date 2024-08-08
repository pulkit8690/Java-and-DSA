import java.util.*;
public class RoottoLeafPath {
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
    public static ArrayList<ArrayList<Integer>> printPath(Node root)
    {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> sub= new ArrayList<>();
        helper(root,ans,sub);
        return ans;
    }
    public static void helper(Node root,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> sub)
    {
        if(root==null)
        {
            return;
        }
        sub.add(root.data);
        if(root.left==null && root.right==null)
        {
            ans.add(new ArrayList<>(sub));
        }
        helper(root.left, ans, sub);
        helper(root.right, ans, sub);
        sub.remove(sub.size()-1);
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
        System.out.println(printPath(root));
    }
}
