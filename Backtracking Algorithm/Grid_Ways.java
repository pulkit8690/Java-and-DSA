/*
 Find Number of Ways to Reach from (0,0) to n-1,m-1 in a n*m grid Allowed Moves Right and Down 
 Time Complexity O(2^(n+m))
 */

public class Grid_Ways {
    public static int gridways(int i,int j, int n, int m)
    {
        //Base
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        else if(i==n || j==n)
        {
            return 0;
        }
        //Recursion
        // Right
        int w1= gridways(i+1, j, n, m);
        // Down
        int w2= gridways(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3;
        int m=2;
        System.out.println(gridways(0,0,n,m));
    }
    
}
