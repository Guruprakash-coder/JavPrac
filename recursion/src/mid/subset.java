package mid;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        subsets("","abc");
        System.out.println(subs("","abc"));
    }
    static  void subsets(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subsets(p+ch,up.substring(1));
        subsets(p,up.substring(1));
    }
    static ArrayList<String> subs(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subs(p+ch,up.substring(1));
        ArrayList<String> right=subs(p,up.substring(1));

        left.addAll(right);
        return left;

    }
}
