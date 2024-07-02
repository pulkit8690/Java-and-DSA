
//O(n)
import java.util.*;
public class NextGreatorElementRight {
    public static int[] NextGreator(int arr[])
    {
        Stack<Integer> s= new Stack<>();
        int[] nxtGreator= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nxtGreator[i]=-1;
            }
            else{
                nxtGreator[i]=arr[s.peek()];
            }
            s.push(i);
        }
        
        return nxtGreator;
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int ans[]=NextGreator(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
