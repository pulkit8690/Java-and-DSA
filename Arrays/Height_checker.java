//https://leetcode.com/problems/height-checker/

import java.util.Arrays;

public class Height_checker {
    public static int height_check(int height[])
    {
        int count=0;
        int expected[]= height.clone();
        Arrays.sort(expected);
        for(int i=0;i<height.length;i++)
        {
            if(height[i] != expected[i])
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int height[]={1,1,4,2,1,3};
        System.out.println(height_check(height));
    }
}
