
import java.util.*;
public class MajorityElement {
    public static ArrayList<Integer> getMajority(int[] arr)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int n= arr.length-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for(Integer key : map.keySet())
        {
            if(map.get(key)>arr.length/3)
            {
                ans.add(key);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int  arr[]={1,2,1,1,2,1,1,2,2,2,4,4};
        System.out.println(getMajority(arr));

    }
}
