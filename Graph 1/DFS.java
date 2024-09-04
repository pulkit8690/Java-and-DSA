import java.util.ArrayList;

public class DFS {
    public static void DFS_1(int node,int visited[], ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj)
    {
        visited[node]=1;
        ans.add(node);
        for(Integer i : adj.get(node))
        {
            if(visited[i]!=1)
            {
                DFS_1(i, visited, ans, adj);
            }
        }
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

        int visited[] = new int[V+1];
        visited[0]=1;
        ArrayList<Integer> ans = new ArrayList<>();
        DFS_1(0,visited,ans, adj);
        System.out.println("DFS Traversal: " + ans);
    }
}
