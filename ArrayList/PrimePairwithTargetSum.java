//package ArrayList;

import java.util.ArrayList;

public class PrimePairwithTargetSum {
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-1);
        list.add(-1);
        for (int a = 2; a <= n / 2; a++) {
            int b = n - a;
            if (isPrime(a) && isPrime(b)) {
                list.set(0, a);
                list.set(1, b);
                break;
            }
        }
        return list;
    }
    public static boolean isPrime(int x)
    {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(getPrimes(10));
    }
}
