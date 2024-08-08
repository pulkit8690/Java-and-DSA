
public class SortedArraytoBST {
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
    public static Node MakeBSt(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        return helper(arr,start,end);
    }
    public static Node helper(int arr[],int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=(start+end)/2;
        Node root= new Node(arr[mid]);
        root.left=helper(arr, start, mid-1);
        root.right=helper(arr, mid+1, end);
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
        int arr[]={3,5,6,8,10,11,12};
        Node root=MakeBSt(arr);
        Preorder(root);
    }
}
