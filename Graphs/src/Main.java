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
        HashSet<Integer> s=new HashSet<>();


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
    private void dfs(int row, int col, boolean[][] vis, int[][] grid, ArrayList<String> vec, int row0, int col0) {
        vis[row][col] = true;
        vec.add(toString(row-row0, col-col0));
        int n = grid.length;
        int m = grid[0].length;
        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, -1, 0, +1};
        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                    && !vis[nrow][ncol]  && grid[nrow][ncol] == 1) {
                dfs(nrow, ncol, vis, grid, vec, row0, col0);
            }
        }
    }

    private String toString(int r,int c){
        return Integer.toString(r)+" "+Integer.toString(c);
    }
    public int countDistinctIslands(int[][] grid) {
        int n= grid.length;
        int m= grid[0].length;
        boolean[][] vis=new boolean[n][m];
        HashSet<ArrayList<String>> st=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]==1){
                    ArrayList<String> isl=new ArrayList<>();
                    dfs(i,j,vis,grid,isl,i,j);
                    st.add(isl);
                }
            }
        }
        return st.size();

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


}