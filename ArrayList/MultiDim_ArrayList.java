//package ArrayList;

import java.util.ArrayList;

public class MultiDim_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(-1);
        list1.add(3);
        list1.add(43);
        list1.add(5);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(-2);
        list2.add(4);
        list2.add(57);
        list2.add(90);
        mainList.add(list1);
        mainList.add(list2);
        System.out.println(mainList);

        for(int i=0;i<mainList.size();i++)
        {
            ArrayList<Integer> CurrList = mainList.get(i);
            for(int j=0;j<CurrList.size();j++)
            {
                System.out.print(CurrList.get(j)+" ");
            }
            System.out.println();
        }

    }
}
