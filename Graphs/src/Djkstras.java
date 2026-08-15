import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Djkstras {
    class Pair{
        int dist;
        int node;
        Pair(int dist,int node){
            this.dist=dist;
            this.node=node;
        }
    }
    public int[] djkstras(int V, ArrayList<ArrayList<Integer>> adj,int s){
        PriorityQueue<Pair> pq=new PriorityQueue<>(
                (x,y)->Integer.compare(x.dist,y.dist)
        );
        int[] dists=new int[V];
        Arrays.fill(dists,Integer.MAX_VALUE);
        dists[s]=0;
        pq.offer(new Pair(0,s));
        while(!pq.isEmpty()){
            Pair node=pq.poll();
            int distance=node.dist;
            int nodeno=node.node;
            for(int i=0;i<adj.get(nodeno).size();i++){
                int edgeweight=adj.get(i).get(1);
                int adjNode=adj.get(i).get(0);

                if(dists[adjNode]==Integer.MAX_VALUE){
                    dists[adjNode]=edgeweight+distance;
                    pq.offer(new Pair(dists[adjNode],adjNode));
                }else if(dists[adjNode]>edgeweight+distance){
                    dists[adjNode]=edgeweight+distance;
                    pq.offer(new Pair(dists[adjNode],adjNode));
                }
            }
        }
        return dists;
    }

}
