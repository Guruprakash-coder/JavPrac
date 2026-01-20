package maze;

import java.util.ArrayList;

public class diag {
    public static void main(String[] args) {
        System.out.println(retmazeDiag("",3,3));
    }
    static ArrayList<String> retmazeDiag(String p, int r, int c){

        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1 && c>1){
            ans.addAll(retmazeDiag(p+'D',r-1,c-1));
        }
        if(r>1){
            ans.addAll(retmazeDiag(p+'v',r-1,c));
        }
        if(c>1){
            ans.addAll(retmazeDiag(p+'h',r,c-1));
        }
        return ans;
    }
}
