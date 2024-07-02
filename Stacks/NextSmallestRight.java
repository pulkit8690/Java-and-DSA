import java.util.*;
public class NextSmallestRight {
    public static int[] NextSmallest_Right(int arr[])
    {
        Stack<Integer> s= new Stack<>();
        int[] nxtSmallest=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
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
        int ans[]=NextSmallest_Right(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
