import java.util.ArrayList;
import java.util.Stack;

public class DAG {
    static class Pair{
        int node;
        int weight;

        public Pair(int node,int weight){
            this.node=node;
            this.weight=weight;
        }

    }

    public int[] shortestPath(int n,int m,int[][] edges){
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Pair>());
        }
        for(int i=0;i<m;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int wt=edges[i][2];
            adj.get(u).add(new Pair(v,wt));
        }
        boolean[] vis=new boolean[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(adj,vis,s,i);
            }
        }
    }
    private void dfs(ArrayList<ArrayList<Pair>> adj,boolean[] vis,Stack<Integer> s,int i){
        vis[i]=true;
        for(Pair p:adj.get(i)){
            int n=p.node;
            if(!vis[n]){
                dfs(adj,vis,s,n);
            }
        }
        s.push(i);

    }
}
