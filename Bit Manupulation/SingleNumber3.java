
import java.util.ArrayList;
public class SingleNumber3 {
    public static ArrayList<Integer> single3(int arr[])
    {
        ArrayList<Integer> list= new ArrayList<>();
        int num=0;
        for(int i=0;i<arr.length;i++)
        {
            num=num^arr[i];
        }
        long  rightmost= num & ~num;
        int b1=0;
        int b2=0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i] & rightmost)!=0)
            {
                b1=b1^arr[i];
            }
            else
            {
                b2=b2^arr[i];
            }
        }
        list.add(b1);
        list.add(b2);
        return list;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,1,3,2,5};
        int arr2[]={-1,0};
        int arr3[]={1,0};
        System.out.println(single3(arr1));
        System.out.println(single3(arr2));
        System.out.println(single3(arr3));
    }
}
