import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
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
        PriorityQueue<Integer> pq=new PriorityQueue<>();


        for(int i=0;i<adj.get(node).size();i++){
            int neigh=adj.get(node).get(i);
            if(!vis[neigh]){
                dfs(neigh,vis,adj,ls);
            }

        }
    }
    public boolean hasCyclebfs(int v,ArrayList<ArrayList<Integer>> adj){
        boolean[] vis=new boolean[adj.size()];
        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
                if(checkcyclebfs(i,adj,vis)) return true;
            }
        }
        return false;
    }
    private boolean checkcyclebfs(int src,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        vis[src]=true;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src,-1));
        while(!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek().second;
            q.poll();
            for(int adnode: adj.get(node)){
                if(!vis[adnode]){
                    vis[adnode]=true;
                    q.add(new Pair(adnode,node));
                }else if(parent!=adnode){
                    return true;
                }
            }

        }
        return false;
    }
    public boolean hasCycledfs(int v,ArrayList<ArrayList<Integer>> adj){
        boolean[] vis=new boolean[adj.size()];
        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
                if(checkcycledfs(i,-1,adj,vis)) return true;
            }
        }
        return false;
    }
    private boolean checkcycledfs(int src,int parent,ArrayList<ArrayList<Integer>> adj,boolean[] vis){

        vis[src]=true;
        for(int neigh:adj.get(src)){
            if(!vis[neigh]){
                if(checkcycledfs(neigh,src,adj,vis)) return true;
            }else if(neigh!=parent){
                return true;
            }

        }
        return false;
    }
    private void dfs(int row, int col, int[] [] vis, int[][] grid, ArrayList<String> vec, int row0, int colo) {
        vis[row][col] = 1;
        vec.add(toString(row row, col colo));
        int n = grid.length;
        int m = grid[0].length;
        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, -1, 0, +1};
        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                    && vis[nrow][col] == 0 && grid[nrow][ncol] == 1) {
                dfs(nrow, ncol, vis, grid, vec, row0, colo);
            }
        }
    }
    public int countDistinctIslands(int[][] grid) {


    }


}