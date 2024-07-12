import java.util.*;

public class JobSequencing {
    public static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int id, int deadline, int profit)
        {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i<jobinfo.length;i++)
        {
            jobs.add(new Job(i,jobinfo[i][0],jobinfo[i][1]));
        }
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);
        ArrayList<Integer> seq= new ArrayList<>();
        int time=0;
        for(int k=0;k<jobs.size();k++)
        {
            Job curr=jobs.get(k);
            if(curr.deadline>time)
            {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Max Jobs: "+seq.size());
        for(int j=0;j<seq.size();j++)
        {
            System.out.print(seq.get(j)+" ");
        }
    }
}