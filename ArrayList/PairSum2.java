//package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    public static boolean pairsum(ArrayList<Integer> list,int target)
    {
        int bp=-1;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        int n=list.size();
        while(lp!=rp)
        {
            if(list.get(lp)+list.get(rp)==target)
            {
                return true;
            }
            if(list.get(lp)+list.get(rp)<target)
            {
                lp=(lp+1)%n;
            }
            else
            {
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(15);
        list1.add(11);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        System.out.println(pairsum(list1,50));
    }
    
}
