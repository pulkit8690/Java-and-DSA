import java.util.ArrayList;

public class Merge2BST {
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
    public static Node mergeBST(Node root1, Node root2) {
        ArrayList<Integer> tree1= new ArrayList<>();
        findInorder(root1,tree1);
        ArrayList<Integer> tree2= new ArrayList<>();
        findInorder(root2,tree2);
        ArrayList<Integer> tree= new ArrayList<>();
        merge(tree,tree1,tree2);
        Node root= createBSt(tree,0,tree.size()-1);
        return root;
    }
    public static void findInorder(Node root,ArrayList<Integer> tree)
    {
        if(root==null)
        {
            return;
        }
        findInorder(root.left,tree);
        tree.add(root.data);
        findInorder(root.right,tree);
    }
    public static void merge(ArrayList<Integer> tree, ArrayList<Integer> tree1, ArrayList<Integer> tree2)
    {
        int i=0;
        int j=0;
        while(i<tree1.size() && j<tree2.size())
        {
            if(tree1.get(i)<tree2.get(j))
            {
                tree.add(tree1.get(i));
                i++;
            }
            else{
                tree.add(tree2.get(j));
                j++;
            }
        }
        while(i<tree1.size())
        {
            tree.add(tree1.get(i));
            i++;
        }
        while(j<tree2.size())
        {
            tree.add(tree2.get(j));
            j++;
        }
    }
    public static Node createBSt(ArrayList<Integer> tree, int s, int e)
    {
        if(s>e)
        {
            return null;
        }
        int mid=s+(e-s)/2;
        Node root= new Node(tree.get(mid));
        root.left=createBSt(tree, s, mid-1);
        root.right=createBSt(tree, mid+1, e);
        return root;
    }
    public static void printInOrder(Node root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(3);
        root1.left = new Node(1);
        root1.right = new Node(5);

        // Second BST
        Node root2 = new Node(4);
        root2.left = new Node(2);
        root2.right = new Node(6);

        // Merge the two BSTs
        Node mergedRoot = mergeBST(root1, root2);

        System.out.print("In-order traversal of the merged BST: ");
        printInOrder(mergedRoot);
    }
}
