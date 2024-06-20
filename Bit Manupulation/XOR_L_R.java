//https://www.geeksforgeeks.org/problems/find-xor-of-numbers-from-l-to-r/1

public class XOR_L_R {
    public static int findXOR(int l, int r) {
        return XOR(l-1) ^ XOR(r);
        
    }
    private static int XOR(int N)
    {
        if(N%4==1)
        {
            return 1;   
        }
        else if(N%4==2)
        {
            return N+1;
        }
        else if(N%4==3)
        {
            return 0;
        }
        else
        {
            return N;
        }
    }
    public static void main(String[] args) {
        int L=4;
        int R=8;
        System.out.println(findXOR(L,R));
    }
}
