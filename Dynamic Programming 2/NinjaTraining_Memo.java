//TC = O(N*4)*3
//SC= O(N) + O(N*4)
//https://www.naukri.com/code360/problems/ninja-s-training_3621003
import java.util.*;
public class NinjaTraining_Memo {
    public static int NinjaTraining(int day, int last, int points[][], int dp[][])
    {
        if(day==0)
        {
            int maxi=0;
            for(int task=0;task<3;task++ )
            {
                if(task!=last)
                {
                    maxi=Math.max(maxi, points[0][task]);
                }
            }
            return maxi;
        }
        if(dp[day][last]!=-1)
        {
            return dp[day][last];
        }
        int maxi=0;
        for(int task=0;task<3;task++)
        {
            if(task!=last)
            {
                int point=points[day][task] + NinjaTraining(day-1, task, points, dp);
                maxi=Math.max(maxi, point);
            }
        }
        return dp[day][last]=maxi;
    }
    public static void main(String[] args) {
        int n=3;
        int points[][]={{1,2,5},{3,1,1},{3,3,3}};
        int dp[][]=new int[n][4];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        System.out.println(NinjaTraining(n-1,3,points,dp));
    }
}
