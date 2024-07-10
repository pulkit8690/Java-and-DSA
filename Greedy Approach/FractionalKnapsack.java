import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static int MaxProfit(int weight[],  int value[], int W)
    {
        double ratio[][]=new double[value.length][2];
        for(int i=0;i<value.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=(double)value[i]/weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int Capacity=W;
        int finalVal=0;
        for(int j=ratio.length-1;j>=0;j--)
        {
            int idx=(int)ratio[j][0];
            if(Capacity>weight[idx])
            {
                finalVal+=value[idx];
                Capacity-=weight[idx];
            }
            else{
                finalVal+=ratio[j][1]*Capacity;
                Capacity=0;
                break;
            }
        }
        return finalVal;
    }
    public static void main(String[] args) {
        int weights[]={10,20,30};
        int value[]={60,100,120};
        int W=50;// Capacity of KNAPSACK
        System.out.println(MaxProfit(weights,value, W));
    }
}
