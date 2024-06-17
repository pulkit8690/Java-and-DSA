public class PowOf2 {
    public static boolean check(int n)
    {
        if((n&(n-1))==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(check(8));
        System.out.println(check(13));
    }
}
