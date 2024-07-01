public class CountNumberOfOdds {
    public static int countOdds(int low, int high)
    {
        return (high+1)/2 - low/2;
    }
    public static void main(String[] args) {
        System.out.println(countOdds(3, 7));
        System.out.println(countOdds(8, 15));
    }
}
