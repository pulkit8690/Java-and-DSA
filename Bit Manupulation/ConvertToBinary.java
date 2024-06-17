public class ConvertToBinary
{
    public static String Binary(int n)
    {
        String ans="";
        while(n!=0)
        {
            if(n%2==1)
            {
                ans=ans+'1';
            }
            else{
                ans=ans+'0';
            }
            n=n/2;
        }
        ans=reverse(ans);
        return ans;
    }
    public static String reverse(String ans)
    {
        String rev="";
        for(int i=ans.length()-1;i>=0;i--)
        {
            rev=rev+ans.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(Binary(8));
    }
}