public class RemoveLastSetBit {
    public static int remove(int n)
    {
        return n & (n-1);
    }
    public static void main(String[] args) {
        System.out.println(remove(9));
    }
}
