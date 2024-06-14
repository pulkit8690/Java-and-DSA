public class Armstrong {
    public static String armstrongNumber(int n) {
        String s="true";
        int N=n;
        int ans=0;
        // code here
        while(n>0)
        {
            int temp=n%10;
            int cube= temp*temp*temp;
            ans=ans+cube;
            n=n/10;
        }
        if(ans==N)
        {
            s="true";
        }
        else
        {
            s="false";
        }
        return s;
    }
    public static void main(String[] args) {
        int n=371;
        System.out.println(armstrongNumber(n));
    }
}
