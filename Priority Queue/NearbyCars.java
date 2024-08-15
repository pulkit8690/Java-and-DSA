import java.util.Arrays;
import java.util.PriorityQueue;

public class NearbyCars {
    public static class  Point implements Comparable<Point> {
        int x;
        int y;
        int dis;
        Point(int x, int y, int dis)
        {
            this.x=x;
            this.y=y;
            this.dis=dis;
        }
        @Override
        public int compareTo(Point p2)
        {
            return this.dis-p2.dis;
        }
    }
    public static int[][] nearby(int points[][], int k)
    {
        PriorityQueue<Point> pq= new PriorityQueue<>();
        for(int i=0;i<points.length;i++)
        {
            int dist=calDist(points[i][0],points[i][1]);
            pq.add(new Point(points[i][0], points[i][1], dist));
        }
        int ans[][]= new int[k][2];
        for(int i=0;i<k;i++)
        {
            Point a= pq.peek();
            ans[i][0]=a.x;
            ans[i][1]=a.y;
            pq.remove();
        }
        return ans;
    }
    public static int calDist(int x, int y)
    {
        return x*x + y*y;
    }
    public static void main(String[] args) {
        int points[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        int[][] closestPoints = nearby(points, k);

        // Printing the result
        for (int[] point : closestPoints) {
            System.out.print(Arrays.toString(point)+" ");
        }
    }
    
}
