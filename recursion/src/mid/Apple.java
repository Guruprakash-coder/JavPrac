package mid;

public class Apple {
    public static void main(String[] args) {
        System.out.println(skipApple("bacapplehbhbr"));
    }
    static String skipApple(String up){
        if(up.isEmpty()){

            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return ch+skipApple(up.substring(1));
        }
    }
}

/*
static String skipApple(String up){
        if(up.isEmpty()){

            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple") && !up.startsWith("apple")){
            return skipApple(up.substring(3));
        }else{
            return ch+skipApple(up.substring(1));
        }
    }
 */
