public class MinimumBitFlips {
    public static int MinimumFlips(int start,int goal)
    {
        int num=start^goal;
        int count=0;
        while(num>0)
        {
            num=num&(num-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(MinimumFlips(3,4));
    }
}
