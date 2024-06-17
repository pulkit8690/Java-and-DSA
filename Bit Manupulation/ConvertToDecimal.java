public class ConvertToDecimal
{
    public static int Decimal(String s)
    {
        int ans=0;
        int base=1; // 2^0 initially
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            {
                ans=ans+base;
            }
            base=base*2; // Increment the base by a power of 2 for the next bit
        }
        return ans;
    }
    public static void main(String[] args) {
        String bin="1000";
        System.out.println(Decimal(bin));
    }
}