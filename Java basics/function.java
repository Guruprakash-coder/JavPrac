import java.util.Scanner;

public class function {
    public static int sum(int a,int b){
        return a+b;
    }
     static String greet(){
        return "hello guys how are you";
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sum(a,b));
        System.out.println(sum(5,9));
        System.out.println(greet());

    }
}
