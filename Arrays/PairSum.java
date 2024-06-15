import java.util.*;
public class PairSum {
    public static int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count=0;
        Arrays.sort(arr);
        int lp=0;
        int rp=n-1;
        while(lp<rp)
        {
            if(arr[lp]+arr[rp]==k)
            {
                count++;
                lp++;
                rp--;
            }
            if(arr[lp]+arr[rp]<k)
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1};
        System.out.println(getPairsCount(arr,4,2));
    }
}