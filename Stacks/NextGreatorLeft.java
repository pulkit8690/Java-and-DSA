import java.util.*;
public class NextGreatorLeft {
    public static int[] NextGreator_Left(int arr[])
    {
        Stack<Integer> s= new Stack<>();
        int[] nxtGreator=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nxtGreator[i]=-1;
            }
            else
            {
                nxtGreator[i]=arr[s.peek()];
            }
            s.push(i);
        }
        return nxtGreator;
        
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int ans[]=NextGreator_Left(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
