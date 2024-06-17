public class SetTheRightmostUnsetBit {
    public static int setBit(int N)
    {
         return N | ~N & (N + 1);
    }
    public static void main(String[] args) {
        System.out.println(setBit(6));
    }
}
