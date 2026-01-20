package mid;

import java.util.ArrayList;

public class asciplussub {
    public static void main(String[] args) {
        //asc("","abc");
        System.out.println(ascret("","abc"));
    }
    static void asc(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        asc(p+ch,up.substring(1));
        asc(p,up.substring(1));
        asc(p+(ch+0),up.substring(1));
    }
    static ArrayList<String> ascret(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left= ascret(p+ch,up.substring(1));
        ArrayList<String> mid= ascret(p,up.substring(1));
        ArrayList<String> right=ascret(p+(ch+0),up.substring(1));
        left.addAll(mid);
        left.addAll(right);
        return left;

    }
}
