import java.util.Scanner;

public class hi {
    public static long solve(int N) {
        // Initialize a DP array to store the number of ways to reach each island
        long[] dp = new long[N + 1];
        
        // Base case: there's 1 way to reach Island 1
        dp[1] = 1;
        
        // Iterate through all islands from 2 to N
        for (int i = 2; i <= N; i++) {
            // For each island, check all possible islands we could have come from
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    // If j is a divisor of i, add the number of ways to reach j
                    dp[i] += dp[j];
                }
            }
        }
        
        // Return the number of ways to reach Island N
        return dp[N];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Number of test cases
        
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            long result = solve(N);
            System.out.println(result);
        }
        
        scanner.close();
    }
}
