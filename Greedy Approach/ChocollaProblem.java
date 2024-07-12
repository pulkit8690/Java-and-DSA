import java.util.Arrays;
import java.util.Collections;

public class ChocollaProblem {
    public static int MinCost(Integer VerCost[], Integer HorCost[]) {
        Arrays.sort(HorCost,Collections.reverseOrder());
        Arrays.sort(VerCost,Collections.reverseOrder());
        int h = 0, v = 0, hp = 1, vp = 1;
        int cost = 0;
        while (h < HorCost.length && v < VerCost.length) {
            if (VerCost[v] <= HorCost[h]) {
                cost += (HorCost[h] * vp);
                hp++;
                h++;
            } else {
                cost += (VerCost[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < HorCost.length) {
            cost += (HorCost[h] * vp);
            hp++;
            h++;
        }
        while (v < VerCost.length) {
            cost += (VerCost[v] * hp);
            vp++;
            v++;
        }
        return cost;
    }

    public static void main(String[] args) {
        Integer VerCost[] = { 2, 1, 3, 1, 4 };
        Integer HorCost[] = { 4, 1, 2 };
        System.out.println(MinCost(VerCost, HorCost));
    }
}
