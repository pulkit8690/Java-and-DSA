import java.util.*;
import java.util.LinkedList;
public class BFS {
    public static ArrayList<Integer> BFS_1(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int visited[]= new int[V]; // Graph starts from 0;
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans= new ArrayList<>();
        q.add(0);
        visited[0]=1;
        while(!q.isEmpty())
        {
            int node=q.remove();
            ans.add(node);
            for(Integer i: adj.get(node))
            {
                if(visited[i]!=1)
                {
                    visited[i]=1;
                    q.add(i);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Creating a sample graph
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(4).add(2);

        ArrayList<Integer> bfsTraversal = BFS_1(V, adj);
        System.out.println("BFS Traversal: " + bfsTraversal);
    }
}
