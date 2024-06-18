// https://leetcode.com/problems/single-number-ii/

public class SingleNumber2 {
    //Bucket Method
    public static int single2(int arr[])
    {
        int ones=0;
        int twos=0;
        for(int i=0;i<arr.length;i++)
        {
            ones= (ones ^ arr[i]) & ~twos;
            twos= (twos ^ arr[i]) & ~ones;
        }
        return ones;
    }
   public static void main(String[] args) {
    int arr1[]={2,2,3,2};
    int arr2[]={0,1,0,1,0,1,99};
    System.out.println(single2(arr1));
    System.out.println(single2(arr2));
   } 
}
