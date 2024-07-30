import java.util.*;
public class SubArraySumK {
    public static int countSubarray(int arr[], int k) //O(n)
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        int sum=0;
        int ans=0;
        for(int j=0;j<arr.length;j++)
        {
            sum+=arr[j];
            if(map.containsKey(sum-k))
            {
                ans+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        System.out.println(countSubarray(arr,k));
    }
}
