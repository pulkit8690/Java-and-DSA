import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void FindCoins(int amount)
    {
        Integer coins[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        Arrays.sort(coins,Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < coins.length; i++) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                ans.add(coins[i]);
                count++;
            }
        }

        System.out.println("Total Coins: " + count);
        System.out.print("Coins used: ");
        for (int coin : ans) {
            System.out.print(coin + " ");
        }
    }
    public static void main(String[] args) {
        FindCoins(590);
    }
}
