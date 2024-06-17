// TC= O(number of setbit)
    // worst case O(31)

public class CountSetBit {
    public static int count1(int n)
    {
        int ans=0;
        while(n>1)
        {
            ans+=n&1;  // similar to n%2==1 ie for odd
            n=n>>1;     // similar to n/2;
        }
        if(n==1)
        {
            ans+=1;
        }
        return ans;
    }
    public static int count2(int n)
    {
        int ans=0;
        while(n!=0)
        {
            n=n&(n-1);
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(count1(9));
        System.out.println(count1(9));
    }
}
