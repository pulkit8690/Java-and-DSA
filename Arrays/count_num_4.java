// https://www.geeksforgeeks.org/problems/count-numbers-containing-43022/1

public class count_num_4 {

    public static int countNumbersWithDigit4(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                if (num % 10 == 4) {
                    count++;
                    break;
                }
                num /= 10;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("The count of numbers containing digit 4 from 1 to " + n + " is: " + countNumbersWithDigit4(n));
    }
}