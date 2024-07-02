import java.util.*;

public class NextSmallestLeft {
    public static int[] NextSmallest_Left(int arr[])
    {
        Stack<Integer> s=new Stack<>();
        int nxtSmallest[]= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nxtSmallest[i]=-1;
            }
            else
            {
                nxtSmallest[i]=arr[s.peek()];
            }
            s.push(i);
        }
        return nxtSmallest;
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int ans[]=NextSmallest_Left(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
