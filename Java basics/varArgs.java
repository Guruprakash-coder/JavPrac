import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
    fun(2,3,4,5,32,45,65,432,12);
    multiple(2,8,"hello","world","mame");
    }
    static void multiple(int a,int b, String ...v){


    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
