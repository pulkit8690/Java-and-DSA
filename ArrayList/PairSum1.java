//package ArrayList;

import java.util.ArrayList;

public class PairSum1 {
    //Brute FOrce O(n^2)
    public static boolean pairsum1(ArrayList<Integer> list,int target)
    {
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i)+list.get(j)== target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    // 2pointer Approach O(n)
    public static boolean pairsum2(ArrayList<Integer> list,int target)
    {
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp)
        {
            if(list.get(lp)+list.get(rp)==target)
            {
                return true;
            }
            if(list.get(lp)+list.get(rp)<target)
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        System.out.println(pairsum2(list1,8));
        System.out.println(pairsum2(list1,50));
    }
}
