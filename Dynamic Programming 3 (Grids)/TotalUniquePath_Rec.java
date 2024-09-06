
public class TotalUniquePath_Rec {
    public static int UniquePath(int m, int n)
    {
        if(m==0 && n==0)
        {
            return 1;
        }
        if(m<0 || n<0)
        {
            return 0;
        }
        int up =UniquePath(m-1, n);
        int left= UniquePath(m, n-1);
        return up+left;
    }
    public static void main(String[] args) {
        int m=3,n=3;
        System.out.println(UniquePath(m-1,n-1));
    }
}
