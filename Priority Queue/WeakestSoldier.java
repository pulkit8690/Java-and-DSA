import java.util.PriorityQueue;

public class WeakestSoldier {
    public static class Row implements Comparable<Row>{
        int idx;
        int soldier;
        Row(int idx, int soldier)
        {
            this.idx=idx;
            this.soldier=soldier;
        }
        @Override
        public int compareTo(Row r2){
            if(this.soldier==r2.soldier)
            {
                return this.idx-r2.idx;
            }else{
                return this.soldier-r2.soldier;
            }
        }
    }
    public static void weakestSoldier(int army[][],int k)
    {
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0;i<army.length;i++)
        {
            int count=0;
            for(int j=0;j<army[0].length;j++)
            {
                count+=army[i][j]==1?1:0;
            }
            pq.add(new Row(i, count));
        }
        for(int i=0;i<k;i++)
        {
            System.out.println("R"+pq.remove().idx);
        }
    }
    public static void main(String[] args) {
        int army[][]={{1,0,0,0},
                     {1,1,1,1},
                     {1,0,0,0},
                     {1,0,0,0}};
        int k=2;
        weakestSoldier(army,k);
    }
}
