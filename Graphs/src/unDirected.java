import java.util.*;

public class unDirected {
    public int[] shortestPath(int[][] edges,int n,int m,int src){
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int dist[]=new int[n];
        Arrays.fill(dist,10_000);
        Queue<Integer> q=new LinkedList<>();
        dist[src]=0;
        q.offer(src);
        while(!q.isEmpty()){
            int node=q.poll();
            for(int it:)
        }

    }

}
