public class Compare_two_fractions
{
    public static String compare(String str)
    {
        String [] frac= str.split(", ");
        String [] frac1= frac[0].split("/");
        String [] frac2= frac[1].split("/");

        // numirator of frac1
        int a=Integer.parseInt(frac1[0]);
        // Denominator of frac1
        int b=Integer.parseInt(frac1[1]);
        // numirator of frac2
        int c=Integer.parseInt(frac2[0]);
        // Denominator of frac2
        int d=Integer.parseInt(frac2[1]);

        int left=a*d;
        int right=b*c;

        if(left>right)
        {
            return frac[0];
        }
        else if(right>left)
        {
            return frac[1];
        }
        else
        {
            return "equal";
        }
        
    }
    public static void main(String[] args) 
    {
        String str="8/1, 1/8";
        System.out.println(compare(str));
    }
}