/*
You are given an array of integers and a target sum. Write a function to find all possible subsequences
of the array whose elements sum up to the given target. Each subsequence should be represented as a list of integers, 
and the function should return a list of these subsequences.
Input: arr = [2, 3, 5, 6, 8, 10], sum = 10
Output: [[2, 3, 5], [10]] 
*/
package Recursion;
import java.util.ArrayList;
public class SubsequenceSum {
    public static ArrayList<ArrayList<Integer>> subsequenceSum(int arr[], int sum)
    {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> sub= new ArrayList<>();
        helper(0,sum,arr,ans,sub);
        return ans;
    }
    public static void helper(int i, int sum,int arr[],ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> sub)
    {
        if (sum == 0) {
            ans.add(new ArrayList<>(sub));
            return;
        }
        if (i >= arr.length) {
            return;
        }
        sub.add(arr[i]);
        helper(i+1, sum-arr[i], arr, ans, sub);
        sub.remove(sub.size()-1);
        helper(i+1, sum, arr, ans, sub);
    }
    public static void main(String[] args) {
        int arr[]={3,1,2};
    System.out.println(subsequenceSum(arr,4));
    }
}
