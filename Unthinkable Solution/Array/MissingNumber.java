package Array;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,6,7,8,9};
        System.out.println(missingNumber(nums));
    }
}
