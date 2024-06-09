// No consecutive 1's are allowed
// https://www.geeksforgeeks.org/problems/consecutive-1s-not-allowed1912/1
package Recursion;

public class BinaryString {
    public static void printBinStr(int n, int lastplace,String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        printBinStr(n-1, 0, str+"0");
        if(lastplace==0)
        {
            printBinStr(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        int n=4;
        int lastplace=0;
        printBinStr(n,lastplace,"");
    }
}
