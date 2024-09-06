// https://www.naukri.com/code360/problems/maze-obstacles_977241

public class UniquePath2_Rec {
    public static int UniquePath(int m,int n, int mat[][])
    {
        if(m==0 && n==0) return mat[0][0] == 0 ? 1 : 0;
        if(m<0 || n<0) return 0;
        if(mat[m][n]==-1) return 0;
        int up= UniquePath(m-1, n, mat);
        int left=UniquePath(m, n-1, mat);
        return up+left;
    }
    public static void main(String[] args) {
        int mat[][]={{0,0,0},{0,-1,0},{0,0,0}};
        int m=mat.length;
        int n=mat[0].length;
        System.out.println(UniquePath(m-1,n-1,mat));
    }
}
