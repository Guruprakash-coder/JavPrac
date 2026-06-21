import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    ArrayList<Integer> bfsOfGraph(int v,ArrayList<ArrayList<Integer>> adj){
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

}