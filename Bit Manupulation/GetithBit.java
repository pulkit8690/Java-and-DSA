
public class GetithBit {
    public static int get(int n,int i)
    {
        if((n&(1<<i))==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(get(8,0));
        System.out.println(get(2,1));
    }
}
