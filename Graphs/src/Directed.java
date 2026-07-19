import java.util.*;

public class Directed {

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[V];
        int pathVis[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                if (dfsCheck(i, adj, vis, pathVis) == true) return true;
            }
        }
        return false;
    }
    private boolean dfsCheck(int i, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] pathVis) {
        vis[i]=1;
        pathVis[i]=1;
        for(int neigh:adj.get(i)){
            if(vis[neigh]==0){
                if(dfsCheck(neigh,adj,vis,pathVis)) return true;
            }else if(pathVis[neigh]==1){
                return true;
            }
        }
        pathVis[i]=0;
        return false;

    }
    static int[] topoSort(int V,List<List<Integer>> adj){
        boolean vis[] =new boolean[V];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                topdfs(adj,s,vis,i);
            }
        }
        int ans[]=new int[V];
        int i=0;
        while(!s.isEmpty()){
            ans[i]=s.pop();
            i++;
        }
        return ans;

    }
    private static void topdfs(List<List<Integer>> adj,Stack<Integer> s,boolean[] vis,int i){
        vis[i]=true;
        for(int neigh:adj.get(i)){
            if(!vis[neigh]){
                topdfs(adj, s, vis, neigh);
            }

        }
        s.push(i);

    }
    public int[] kahn(List<List<Integer>> adj){
        List<Integer> ans=new ArrayList<>();
        int[] InDegree=new int[adj.size()];
        for(List<Integer> l :adj){
            for(int it:l){
                InDegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<InDegree.length;i++){
            if(InDegree[i]==0){
                q.offer(i);
            }
        }
        int[] topo=new int[adj.size()];
        int ind=0;
        while(!q.isEmpty()){
            int node=q.poll();
            topo[ind++]=node;

        }

    }
}


