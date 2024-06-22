// WRONG
// https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1

import java.util.*;

public class CountPairsWithGivenSum {
    public static int pairsum(int arr[],int n,int k)
    {
        // Sort the array
            Arrays.sort(arr);
            int count = 0;
            
            // Initialize two pointers
            int left = 0;
            int right = n - 1;
            
            // Use the two-pointer technique
            while (left < right) {
                int sum = arr[left] + arr[right];
                
                if (sum == k) {
                    count++;
                    left++;
                    right--;
                } else if (sum < k) {
                    left++;
                } else {
                    right--;
                }
            }
            
            return count;
    }
    public static void main(String[] args) {
        int arr[]={1, 5, 7, 1};
        System.out.println(pairsum(arr,4,6));
    }
}
