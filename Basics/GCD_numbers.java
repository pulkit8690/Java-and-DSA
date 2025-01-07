import java.util.Arrays;

public class GCD_numbers {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Ensure the result is always positive
    }

    public static void printResult(int result, int expected) {
        System.out.println("Result: " + result + ", Expected: " + expected + " -> " + (result == expected ? "PASS" : "FAIL"));
    }

    public static void runTests() {
        int[][] testCases = {
            {3, 2},    // Test Case 1
            {4, 2},    // Test Case 2
            {54, 24},  // Test Case 3
            {5, 0},    // Test Case 4
            {0, 7},    // Test Case 5
            {5, 5},    // Test Case 6
            {12, 12},  // Test Case 7
            {-3, 2},   // Test Case 8
            {4, -2},   // Test Case 9
            {-3, -2},  // Test Case 10
            {-54, -24},// Test Case 11
            {0, 0},    // Edge Case 1: Both numbers are zero
            {Integer.MAX_VALUE, Integer.MAX_VALUE}, // Edge Case 2: Both numbers are the maximum integer value
            {Integer.MIN_VALUE, Integer.MIN_VALUE}, // Edge Case 3: Both numbers are the minimum integer value
            {Integer.MAX_VALUE, 1}, // Edge Case 4: One number is the maximum integer value
            {Integer.MIN_VALUE, 1}  // Edge Case 5: One number is the minimum integer value
        };

        int[] expectedResults = {
            1,  // Expected Result for Test Case 1
            2,  // Expected Result for Test Case 2
            6,  // Expected Result for Test Case 3
            5,  // Expected Result for Test Case 4
            7,  // Expected Result for Test Case 5
            5,  // Expected Result for Test Case 6
            12, // Expected Result for Test Case 7
            1,  // Expected Result for Test Case 8
            2,  // Expected Result for Test Case 9
            1,  // Expected Result for Test Case 10
            6,  // Expected Result for Test Case 11
            0,  // Expected Result for Edge Case 1
            Integer.MAX_VALUE, // Expected Result for Edge Case 2
            Integer.MIN_VALUE, // Expected Result for Edge Case 3
            1,  // Expected Result for Edge Case 4
            1   // Expected Result for Edge Case 5
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] testCase = testCases[i];
            int result = gcd(testCase[0], testCase[1]);
            System.out.print("Test Case " + (i + 1) + ": ");
            printResult(result, expectedResults[i]);
        }
    }

    public static void main(String[] args) {
        runTests();
    }
}

