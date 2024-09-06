//https://www.naukri.com/code360/problems/ninja-s-training_3621003
//TC = O(N*4)*3
//SC= O(N*4)
public class NinjaTraining_Tabu {
    public static int NinjaTraining(int n,int points[][])
    {
        int dp[][] = new int[n][4];
        dp[0][0]=Math.max(points[0][1], points[0][2]);
        dp[0][1]=Math.max(points[0][0], points[0][2]);
        dp[0][2]=Math.max(points[0][0], points[0][1]);
        dp[0][3]=Math.max(points[0][2],Math.max(points[0][0], points[0][1]));

        for(int day=1;day<n;day++)
        {
            for(int last=0;last<4;last++)
            {
                dp[day][last]=0;
                for(int task=0;task<3;task++)
                {
                    if(task!=last)
                    {
                        int point=points[day][task] + dp[day-1][task];
                        dp[day][last]=Math.max(dp[day][last], point);
                    }
                }
            }
        }
        return dp[n-1][3];

    }
    public static void main(String[] args) {
        int n=3;
        int points[][]={{1,2,5},{3,1,1},{3,3,3}};
        System.out.println(NinjaTraining(n,points));
    }
}
