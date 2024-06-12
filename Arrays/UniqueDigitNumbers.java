public class UniqueDigitNumbers{

    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        
        int count = 1; // For the number 0
        
        for (int i = 1; i <= n; i++) {
            int uniqueDigits = 9;
            for (int j = 1; j < i; j++) {
                uniqueDigits *= (10 - j);
            }
            count += uniqueDigits;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        // Example usage:
        System.out.println(countNumbersWithUniqueDigits(2)); // Output: 91
        System.out.println(countNumbersWithUniqueDigits(0)); // Output: 1
    }
}
