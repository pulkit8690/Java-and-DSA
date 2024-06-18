//https://leetcode.com/problems/single-number/
public class SingleNumber1 {
    public static int single1(int arr[])
    {
        int xor=0;
        for(int i=0;i<arr.length;i++)
        {
            xor=xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr1[]={2,2,1};
        int arr2[]={4,1,2,1,2};
        int arr3[]={1};
        System.out.println(single1(arr1));
        System.out.println(single1(arr2));
        System.out.println(single1(arr3));
    }
}
