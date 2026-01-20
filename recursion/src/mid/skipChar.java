package mid;

public class skipChar {
    public static void main(String[] args) {
         remove("",'l',"Hello world");

    }
    static void remove(String p,char rem,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch==rem){
            remove(p,rem,up.substring(1));
        }else{
            remove(p+ch,rem,up.substring(1));
        }

    }
}
/*

static String remove(String up,char rem){
if(up.isEmpty()){
return "";
}
char ch=up.charAt(0);
if(ch==rem){
return remove(up.substring(1));
}
else{
return remove ch + remove(up.substring(1),rem);
}
}
}
 */
