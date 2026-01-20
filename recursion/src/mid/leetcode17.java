package mid;

import java.util.ArrayList;

public class leetcode17 {
    public static void main(String[] args) {
        telecombi("","12");
        

    }
    static void telecombi(String p,String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            telecombi(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> pad(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> ans=new ArrayList<>();
        for(int i=(digit-1)*3;i<(digit*3);i++){
            char ch=(char)('a'+i);
            ans.addAll(pad(p+ch,up.substring(1)));

        }
        return ans;
    }
}
