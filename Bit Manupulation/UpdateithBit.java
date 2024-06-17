
public class UpdateithBit {
    public static int update(int n, int i)
    {
        int bitmask=1<<i;
        return n^bitmask;
    }
    public static void main(String[] args) {
        System.out.println(update(8,0));
        System.out.println(update(13,1));
    }
}
