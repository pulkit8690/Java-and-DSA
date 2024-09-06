//https://www.naukri.com/code360/problems/ninja-s-training_3621003
public class NinjaTraining_Rec{
    public static int NinjaTraining(int day, int points[][],int last)
    {
        if(day==0)
        {
            int maxi=0;
            for(int task=0;task<3;task++)
            {
                if(task!=last)
                {
                    maxi=Math.max(maxi, points[0][task]);
                }
            }
            return maxi;
        }
        int maxi=0;
        for(int task=0;task<3;task++)
        {
            if(task!=last)
            {
                int point=points[day][task]+NinjaTraining(day-1, points, task);
                maxi=Math.max(maxi, point);
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int n=3;
        int points[][]={{1,2,5},{3,1,1},{3,3,3}};
        System.out.println(NinjaTraining(n-1,points,3));
    }
}