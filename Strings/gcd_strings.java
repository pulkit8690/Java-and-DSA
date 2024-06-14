public class gcd_strings {
    public static String gcdOfStrings(String str1, String str2) {
        if(str1.equals(""))
        {
            return str2;
        }
        if(str2.equals(""))
        {
            return str1;
        }
        if(!(str1+str2).equals(str2+str1))
        {
            return "";
        }
        int gcdlength= gcd(str1.length(),str2.length());
        return str1.substring(0,gcdlength);
    }
    public static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
             b=a%b;
             a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
    }
}
