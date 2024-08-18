

public class MaxXor2 {
    public static class Node {
        Node children[]= new Node[2];
    }
    public static void insert(Node root, int num)
    {
        Node curr= root;
        for(int i=31;i>=0;i--)
        {
            int bit=(num>>i)&1;
            if(curr.children[bit]==null)
            {
                curr.children[bit]= new Node();
            }
            curr= curr.children[bit];
        }
    }
    public static int GetMaxXor(Node root, int key)
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
        int arr1[]={9,8,7,6,5};
        int arr2[]={8,4,3,2,1};
        Node root= new Node();
        for(int i=0;i<arr1.length;i++)
        {
            insert(root, arr1[i]);
        }
        int maxXor=0;
        for(int i=0;i<arr2.length;i++)
        {
            int currentXor = GetMaxXor(root, arr2[i]);
            maxXor = Math.max(maxXor, currentXor);
        }
        System.out.println(maxXor);
    }
}
