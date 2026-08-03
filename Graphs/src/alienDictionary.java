import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class alienDictionary {
    List<Integer> toposort(int k,List<List<Integer>> adj){
        int[] inDegree=new int[k];
        for(int i=0;i<adj.size();i++){
            for(int j:adj.get(i)){
                inDegree[j]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        List<Integer> topo=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            topo.add(node);
            for(int neigh:adj.get(node)){
                if(--inDegree[neigh]==0){
                    q.offer(neigh);
                }
            }
        }
        return topo;

    }
    String findOrder(String[] dict,int N,int k){
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<k;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<N-1;i++){
            String s1=dict[i];
            String s2=dict[i+1];
            int len=Math.min(s1.length(),s2.length());
            for(int j=0;j<len;j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    adj.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                    break;
                }
            }

        }
        List<Integer> topo=toposort(k,adj);
        StringBuilder ans=new StringBuilder();
        for(int i:topo){
            ans.append((char)(i+'a'));
        }
        return ans.toString();
    }
}
