

public class MaxXor1 {
    public static class Node{
        Node children[]= new Node[32];
    }
    public static void insert(Node root, int num)
    {
        Node curr=root;
        for(int i=31;i>=0;i--)
        {
            int bit=(num>>i)&1;
            if(curr.children[bit]==null)
            {
                curr.children[bit]=new Node();
            }
            curr=curr.children[bit];
        }
    }
    public static int GetMaxXor(Node root,int key)
    {
        Node curr= root;
        int maxXor=0;
        for(int i=31;i>=0;i--)
        {
            int bit=(key>>i)&1;
            int oppBit=1-bit;
            if(curr.children[oppBit]!=null)
            {
                maxXor=maxXor|(1<<i);
                curr=curr.children[oppBit];
            }else{
                curr=curr.children[bit];
            }
        }
        return maxXor;
    }

    public static void main(String[] args) {
        int arr[]={9,8,7,6,5};
        int num=8;
        Node root= new Node();
        for(int i=0;i<arr.length;i++)
        {
            insert(root, arr[i]);
        }
        int maxXor=GetMaxXor(root, num);
        System.out.println(maxXor);
    }
}
