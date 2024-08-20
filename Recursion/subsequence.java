/*
Given an array of integers, write a function that finds all possible subsequences of the array. 
A subsequence is defined as a sequence derived from the array by deleting some or no elements 
    without changing the order of the remaining elements.
The function should return a list of these subsequences.
Input: arr = [1, 2, 3]
Output: [[], [1], [2], [3], [1, 2], [1, 3], [2, 3], [1, 2, 3]]
 */

package Recursion;
import java.util.ArrayList;

public class subsequence {
    public static ArrayList<ArrayList<Integer>> findSub(int arr[])
    {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> sub = new ArrayList<>();
        helper(0,arr, sub, ans);
        return ans;
    }
    public static void helper(int i, int arr[],ArrayList<Integer> sub,ArrayList<ArrayList<Integer>> ans)
    {
        if(i==arr.length)
        {
            ans.add(new ArrayList<>(sub));
            return;
        }
        sub.add(arr[i]);
        helper(i+1, arr, sub, ans);
        sub.remove(sub.size()-1);
        helper(i+1, arr, sub, ans);
    }
    public static void main(String[] args) {
        int arr[]= {3,1,2};
        System.out.println(findSub(arr));
    }
}
