public class NumberOfDiagnols {
    public static long number(int n)
    {
        if(n<3)
        {
            return 0;
        }
        long N= (long)n;
        return (N*(N-3))/2;
    }
    public static void main(String[] args) {
        System.out.println(number(3));
    }
}
