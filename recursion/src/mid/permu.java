package mid;

import java.util.ArrayList;

public class permu {
    public static void main(String[] args) {
        //per("","abc");
        ArrayList<String> ans=permutation("","abcd");
        System.out.println(ans);
        String ab="ab";

        System.out.println(ab.equals("hsb"));
    }
    static void per(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);


        for(int i=0;i<p.length()+1;i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            per(f+ch+s,up.substring(1));
        }

    }
    static ArrayList<String> permutation(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutation(f+ch+s,up.substring(1)));
        }
        return ans;

    }
    static int percnt(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);

        int count=0;

        for(int i=0;i<p.length()+1;i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count+= percnt(f+ch+s,up.substring(1));
        }
        return count;

    }
}
