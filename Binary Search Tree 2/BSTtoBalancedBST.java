import java.util.ArrayList;

public class BSTtoBalancedBST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void findInorder(Node root, ArrayList<Integer> inOrderList)
    {
        if(root==null)
        {
            return;
        }
        findInorder(root.left, inOrderList);
        inOrderList.add(root.data);
        findInorder(root.right, inOrderList);
    }
    public static Node MakeBSt(ArrayList<Integer> inOrderList, int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(inOrderList.get(mid));
        root.left=MakeBSt(inOrderList, start, mid-1);
        root.right=MakeBSt(inOrderList, mid+1, end);
        return root;
    }
    public static Node MakeBalancedBST(Node root)
    {
        //inorder seq
        ArrayList<Integer> inOrderList = new ArrayList<>();
        findInorder(root,inOrderList);

        //make bst
        int start=0;
        int end=inOrderList.size()-1;
        return MakeBSt(inOrderList,start,end);
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
        // Create an example unbalanced BST
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right=new Node(12);
    
        // Convert the unbalanced BST to a balanced BST
        Node balancedRoot = MakeBalancedBST(root);
    
        // Print the preorder traversal of the balanced BST
        System.out.println("Preorder traversal of balanced BST:");
        Preorder(balancedRoot);
    }
    
}
