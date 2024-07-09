import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection_WithoutSorted {
    public static void Max_Activity(int[] start, int[] end)
    {
        int[][] activities= new int[start.length][3];
        for(int i=0;i<start.length;i++)
        {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
        int maxAct=0;
        ArrayList<Integer> ans= new ArrayList<>();

        //ist activity
        maxAct=1;
        ans.add(activities[0][0]);
        int lastend=activities[0][2];
        for(int j=1;j<start.length;j++)
        {
            if(activities[j][1]>=lastend)
            {
                maxAct++;
                ans.add(activities[j][0]);
                lastend=activities[j][2];
            }
        }
        System.out.println("Maximum Activities: "+maxAct);
        for(int k=0;k<ans.size();k++)
        {
            System.out.print("A"+ans.get(k)+" ");
        }
    }
    public static void main(String[] args) {
        int start[]={0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};
        // int start[]={1,3,0,5,8,5};
        // int end[]={2,4,6,7,9,9};
        Max_Activity(start,end);
    }
}
