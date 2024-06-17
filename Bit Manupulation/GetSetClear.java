public class GetSetClear {
    public static void bitManipulation(int num, int i) {
        // code here
        int bitmask=1<<(i-1);
        int x= (num&bitmask)!=0 ? 1:0;
        int y=num|bitmask;
        int z= num&(~(bitmask));
        System.out.println(x+" "+y+" "+z);
    }
    public static void main(String[] args) {
        bitManipulation(70, 3); // Expected Output: 1 70 66
        bitManipulation(8, 1);  // Expected Output: 0 9 8
        bitManipulation(678883006, 16); // Expected Output: 1 678883006 678850238

    }
}
