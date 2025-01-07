/*
    Question 1

    How to Attempt?

    Black and White Walls

    There are N black and white colored walls (1 <= N <= 89). You are given a string array named Colors, where each element of the array is either "White" or "Black", representing the initial color of the walls.

    By choosing a Black wall and a White wall, you can swap their colors at some cost. You can do this swapping any number of times. The cost of swapping colors of an ith (1 <= i <= N) White colored wall with a jth (1 <= j <= N) Black colored wall is calculated as |i - j|.

    Your task is to find and return the minimum cost to be incurred for changing the initially Black colored walls to White colored walls using the method mentioned above.

    Note:

        Initially, the total number of Black walls is not greater than half of the total number of walls.
        Consider 1-based indexing.

    Input Specification:

        input1 : An integer value N representing the number of walls.
        input2 : A string array Colors, where each element of the array is either "White" or "Black", representing the initial color of the wall.

    Output Specification: Return an integer value representing the minimum cost of changing the initially Black colored walls to White colored walls using the method mentioned above.

Image 2:

    Example 1:

        input1 : 6
        input2 : {Black, Black, Black, White, White, White}
        Output : 9

    Explanation:

        Choose the first and fourth index walls and swap their colors. The cost will be |1 - 4| = 3 and the Colors array will now become: {White, Black, Black, Black, White, White}.
        Now choose the second and sixth index walls and swap their colors. The cost will be |2 - 6| = 4 and the Colors array will now become: {White, White, Black, Black, White, Black}.
        Now choose the third and fifth index walls and swap their colors. The cost will be |3 - 5| = 2 and the Colors array will now become: {White, White, White, Black, Black, Black}.
        The final cost will be 7 + 2 = 9. As 9 is the minimum cost to be incurred to make all the initially black colored walls white, 9 is returned as the output.

Image 3:

    Example 2:

        input1 : 3
        input2 : {White, White, White}
        Output : 0

    Explanation: All the walls are white colored, so no swapping needs to be done and hence the net cost is 0. Therefore, 0 will be returned as the output.
 */
import java.util.*;

class Ques1 {
    public static int Mincost(int input1, String[] input2) {
        int N = input1;
        List<Integer> blackPositions = new ArrayList<>();
        List<Integer> whitePositions = new ArrayList<>();

        // Populate black and white positions
        for (int i = 1; i <= N; i++) {
            if (input2[i - 1].equals("Black")) {
                blackPositions.add(i);
            } else if (input2[i - 1].equals("White")) {
                whitePositions.add(i);
            }
        }

        int B = blackPositions.size();
        int W = whitePositions.size();

        // Edge case: no black walls
        if (B == 0) return 0;

        int INF = Integer.MAX_VALUE / 2; // Use a high initial value to prevent overflow
        int[][] dp = new int[B + 1][W + 1];

        // Initialize dp array with INF
        for (int i = 0; i <= B; i++) {
            Arrays.fill(dp[i], INF);
        }

        // Set base cases
        for (int j = 0; j <= W; j++) {
            dp[0][j] = 0;
        }

        // Fill DP table with corrected update logic
        for (int i = 1; i <= B; i++) {
            for (int j = i; j <= W; j++) {
                // Carry forward the minimum cost from skipping the current white wall
                dp[i][j] = dp[i][j - 1];

                // Calculate the cost of converting the i-th black wall with the j-th white wall
                int cost = Math.abs(blackPositions.get(i - 1) - whitePositions.get(j - 1));

                // Update dp[i][j] with the minimum of either skipping or using the white wall
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + cost);
            }
        }

        // Final DP table for reference
        System.out.println("Final DP Table:");
        for (int i = 0; i <= B; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        // Return the minimum cost to convert all black walls
        return dp[B][W];
    }

    public static void main(String[] args) {

        // Example 1
        int input1 = 6;
        String[] input2 = {"Black", "White", "Black", "White", "Black", "White"};

        int result = Mincost(input1, input2);
        System.out.println("Minimum cost to convert all Black walls to White: " + result); // Expected output: 9

        // Example 2 (All walls are already white)
        int input3 = 3;
        String[] input4 = {"White", "White", "White"};

        int result2 = Mincost(input3, input4);
        System.out.println("Minimum cost to convert all Black walls to White: " + result2); // Expected output: 0
    }
}
