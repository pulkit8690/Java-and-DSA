
public class OddEven {
    public static void check(int n)
    {
        if((n & 1)==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        check(3);
        check(4);
    }
}
