public class NumberOfDigits {
    public static int Number(int number,int base)
    {
        int ans= (int)(Math.log(number)/Math.log(base))+1;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Number(8,2));
        System.out.println(Number(34576,10));
    }
}
