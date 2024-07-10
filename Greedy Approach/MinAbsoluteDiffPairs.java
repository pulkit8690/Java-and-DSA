import java.util.Arrays;

public class MinAbsoluteDiffPairs {
    public static int MinAbsoluteDiff(int[] A, int[] B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int min_val=0;
        for(int i=0;i<A.length;i++)
        {
            min_val+=Math.abs(A[i]-B[i]);
        }
        return min_val;
    }
    public static void main(String[] args) {
        int[] A={4,1,8,7};
        int[] B={2,3,6,5};
        System.out.println(MinAbsoluteDiff(A,B));
    }
}
