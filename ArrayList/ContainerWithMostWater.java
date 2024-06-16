//package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {

    //Brute Force Approach  O(n^2)
    public static int MaxWater1(ArrayList<Integer> Height)
    {
        int maxWater=0;
        for(int i=0;i<Height.size();i++)
        {
            for(int j=i+1;j<Height.size();j++)
            {
                int width=j-i;
                int height=Math.min(Height.get(i), Height.get(j));
                int CurrWater=height*width;
                maxWater=Math.max(maxWater, CurrWater);
            }
        }
        return maxWater;
    }
    // 2Pointer Aproach O(n)
    public static int MaxWater2(ArrayList<Integer> Height)
    {
        int lp=0;
        int rp=Height.size()-1;
        int maxWater=0;
        while(lp<rp)
        {
            int width=rp-lp;
            int height=Math.min(Height.get(lp),Height.get(rp));
            int CurrWater=height*width;
            maxWater=Math.max(CurrWater, maxWater);
            if(Height.get(lp)<Height.get(rp))
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
         ArrayList<Integer> Height=new ArrayList<>();
         Height.add(1);
         Height.add(8);
         Height.add(6);
         Height.add(2);
         Height.add(5);
         Height.add(4);
         Height.add(8);
         Height.add(3);
         Height.add(7);
        //System.out.println("The Maximum Water that can be hold is "+MaxWater1(Height));
        System.out.println("The Maximum Water that can be hold is "+MaxWater2(Height));
    }
}
