
// sum(i+1,j)=sum(0,j)-sum(0,i)
import java.util.*;
public class LargestSubarrayWithSum0 {
    public static int findLen(int[] arr)
    {
        int sum=0;
        int len=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==0)
            {
                len=i+1;
            }else{
                if(map.containsKey(sum))
                {
                    len=Math.max(len, i-map.get(sum));
                }else{
                    map.put(sum, i);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,10,23};
        System.out.println(findLen(arr));
    }
}
