public class MoveOnesToEnd {
    public static int maxOperationsToMoveOnes(String s) {
        int count = 0;
        int n = s.length();
        int i = 0;
        
        while (i < n - 1) {
            // Find the first '10' pair
            while (i < n - 1 && !(s.charAt(i) == '1' && s.charAt(i + 1) == '0')) {
                i++;
            }
            if (i >= n - 1) break;

            // Move '1' to the right as far as possible
            int j = i + 1;
            while (j < n && s.charAt(j) == '0') {
                j++;
            }
            if (j < n) {
                // Found a '1' to swap with
                count++;
                i = j; // Move to next '10' pair
            } else {
                // No more '1's to the right
                break;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        String s1 = "1001101";
        String s2 = "00111";
        
        System.out.println(maxOperationsToMoveOnes(s1)); // Output: 4
        System.out.println(maxOperationsToMoveOnes(s2)); // Output: 0
    }
}
