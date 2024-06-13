/*
 To Solve in O(n)
use                   (n-1+m-1)!
                    ---------------
                    (n-1)! * (m-1)!
 */


public class Grid_Ways_LinearTime {
    public static int factoriral(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n* factoriral(n-1);
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int gridways= factoriral(n-1+m-1)/(factoriral(n-1)*factoriral(m-1));
        System.out.println("Total Ways : "+gridways);
    }
}
