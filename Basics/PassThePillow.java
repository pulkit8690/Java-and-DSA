//https://leetcode.com/problems/pass-the-pillow/

public class PassThePillow {
    public static int findHolder(int n, int time)
    {
        // Calculate the number of complete rounds
        int rounds= time/(n-1);
        // Determine if the number of rounds is even or odd
        if((rounds&1)==0) // Even number of rounds: moving forward
        {
            return 1+time%(n-1);
        }
        else
        {
            // Odd number of rounds: moving backward
            return n-time%(n-1);
        }
    }
    public static void main(String[] args) {
        int n1 = 4;
        int time1 = 5;
        System.out.println("Example 1 Output: " + findHolder(n1, time1));  // Output: 2

        // Example 2
        int n2 = 3;
        int time2 = 2;
        System.out.println("Example 2 Output: " + findHolder(n2, time2));  // Output: 3
    }
}
