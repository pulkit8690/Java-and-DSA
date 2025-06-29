import java.util.Stack;

public class arrange132 {
    public static void main(String args[])
    {
        int arr[]={-1,3,2,0};
        int n=arr.length;
        System.out.println(find132(arr,n));
    }
    public static boolean find132(int arr[], int n)
    {
        Stack<Integer> s= new Stack<>();
        int Sh=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i++)
        {
            if(arr[i]<Sh) return true;
            while(!s.isEmpty() && arr[i]>s.peek())
            {
                Sh=Math.max(Sh,s.pop());
            }
            s.push(arr[i]);
        }
        return false;
    }
}
