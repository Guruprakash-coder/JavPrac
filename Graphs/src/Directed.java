import java.util.ArrayList;

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
        for(int neigh:ArrayList.get(i)){
            if(vis[neigh]==0){
                if(dfsCheck(neigh,adj,vis,pathVis)) return true;
            }else if(pathVis[i]==1){
                return true;
            }
        }
        pathVis[i]=0;
        return false;

    }
}


