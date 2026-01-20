import java.util.Scanner;

public class swap {
    static int a=0;
    static int b=0;
    static void swape(){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
        swape();
        System.out.println(a+" "+b);

    }
}
