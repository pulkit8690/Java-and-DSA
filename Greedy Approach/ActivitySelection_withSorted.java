
// END TIME IS SORTED
import java.util.ArrayList;

public class ActivitySelection_withSorted {
    public static void MaximumActivity(int start[], int end[])
    {
        int maxAct=0;
        ArrayList<Integer> ans= new ArrayList<>();

        //Ist Activity
        maxAct=1;
        ans.add(0);
        int lastend=end[0];
        for(int i=1;i<end.length;i++)
        {
            if(start[i]>lastend)
            {
                maxAct++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.println("Maximum Activity: "+maxAct);
        for(int j=0;j<ans.size();j++)
        {
            System.out.print("A"+ans.get(j)+" ");
        }
        
    }
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9}; // Sorted GIVEN
        MaximumActivity(start,end);
    }
}
