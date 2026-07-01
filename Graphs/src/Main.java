import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    List<Integer> bfsOfGraph(int v,ArrayList<ArrayList<Integer>> adj){
        boolean[] vis=new boolean[v];
        List<Integer> bfs=new ArrayList<>();
        vis[0]=true;
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        while(!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);
            for(int n:adj.get(node)){
                if(vis[n]==false){
                    q.offer(n);
                    vis[n]=true;
                }
            }

        }
        return bfs;

    }
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj){
        boolean[] vis=new boolean[adj.size()];
        vis[0]=true;
        ArrayList<Integer> ans=new ArrayList<>();
        dfs(0,vis,adj,ans);
        return ans;
    }
    private static void dfs(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ls){
        vis[node]=true;
        ls.add(node);
        
        for(int i=0;i<adj.get(node).size();i++){
            int neigh=adj.get(node).get(i);
            if(!vis[neigh]){
                dfs(neigh,vis,adj,ls);
            }

        }
    }

}