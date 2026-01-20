
public class staticBlock {

    static int a=4;
    static int b=6;
    static{
        System.out.println("We are in static block");
        b=a*5;
    }
    public static void main(String[] args) {
        staticBlock obj =new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);

    }
}
