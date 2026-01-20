package maze;

import java.util.ArrayList;

public class printPath {
    public static void main(String[] args) {
        //printmaze("",3,3);\
        System.out.println(retmaze("",3,3));
    }
    static void printmaze(String p,int r,int c){

        if(r==1 && c==1){
            System.out.println(p);
            return;

        }
        if(r>1){
            printmaze(p+'r',r-1,c);
        }
        if(c>1){
            printmaze(p+'d',r,c-1);
        }

    }

    static ArrayList<String> retmaze(String p, int r, int c){

        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1){
            ans.addAll(retmaze(p+'r',r-1,c));
        }
        if(c>1){
            ans.addAll(retmaze(p+'d',r,c-1));
        }
        return ans;
    }
}
