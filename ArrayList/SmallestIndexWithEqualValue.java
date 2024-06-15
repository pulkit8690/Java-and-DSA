//package ArrayList;


// https://leetcode.com/problems/smallest-index-with-equal-value/
import java.util.*;
public class SmallestIndexWithEqualValue {
    public static int smallestEqual(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i%10==nums[i])
            {
                list.add(i);
            }
        }
       if(list.size()>0)
       {
           return list.get(0);
       }
        else
        {
            return -1;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,1,3,4,7};
        System.out.println(smallestEqual(arr));
    }
}