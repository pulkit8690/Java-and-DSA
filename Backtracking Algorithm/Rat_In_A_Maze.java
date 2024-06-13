public class Rat_In_A_Maze {
    public static void move(int path[][],int i,int j,int n,String ans,int visited[][] )
    {
        if(i==n-1 && j==n-1)
        {
            System.out.println(ans);
            return;
        }
        // Downwards
        if(i+1<n && visited[i+1][j]==0 && path[i+1][j]==1)
        {
            visited[i][j]=1;
            move(path, i+1, j, n, ans+'D',visited);
            visited[i][j]=0;
        }
        //Upwards
        if(i-1>=0 && visited[i-1][j]==0 && path[i-1][j]==1)
        {
            visited[i][j]=1;
            move(path, i-1, j, n, ans+'U',visited);
            visited[i][j]=0;
        }
        //Right
        if(j+1<n && visited[i][j+1]==0 && path[i][j+1]==1)
        {
            visited[i][j]=1;
            move(path, i, j+1, n, ans+'R',visited);
            visited[i][j]=0;
        }
        //Left
        if(j-1>=0 && visited[i][j-1]==0 && path[i][j-1]==1)
        {
            visited[i][j]=1;
            move(path, i, j-1, n, ans+'L',visited);
            visited[i][j]=0;
        }


    }
    public static void main(String[] args) {
        int n=4;
        int path[][]={{1, 0, 0, 0},
                    {1, 1, 0, 1}, 
                    {1, 1, 0, 0},
                    {0, 1, 1, 1}};
        int visited[][]=new int[n][n];
        move(path,0,0,n,"",visited);
    }
}
