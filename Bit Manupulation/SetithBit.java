
public class SetithBit {
    public static int set(int n,int i)
    {
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static void main(String[] args) {
        System.out.println(set(6,0));
    }
}
