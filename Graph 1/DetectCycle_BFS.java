import java.util.*;

public class DetectCycle_BFS {
    public static class Node {
        int first;
        int second;
        Node(int first, int second)
        {
            this.first=first;
            this.second=second;
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(2).add(4);
        adj.get(3).add(4);
        boolean ans = isCycle(6, adj);
        if (ans)
            System.out.println("Cycle Detected");    
        else
            System.out.println("No Cycle Detected");
    }
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int visited[]= new int[V];
        Arrays.fill(visited, 0);
        int parent[] = new int[V];
        Arrays.fill(parent, -1);
        for(int i=0;i<V;i++)
        {
            if(visited[i]!=1)
            {
                if(checkIsCycle(i,adj,visited,parent))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkIsCycle(int s,  ArrayList<ArrayList<Integer>> adj, int visited[], int parent[])
    {
        Queue<Node> q= new LinkedList<>();
        q.add(new Node(s,-1));
        visited[s]=1;
        while(!q.isEmpty())
        {
            int node=q.peek().first;
            int par=q.peek().second;
            q.remove();
            for(Integer it : adj.get(node))
            {
                if(visited[it]!=1)
                {
                    q.add(new Node(it, node));
                    visited[it]=1;
                }
                else if(par!=it)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
