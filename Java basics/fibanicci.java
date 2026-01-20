import java.util.Scanner;

public class fibanicci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int temp =b;
            b+=a;
            a=temp;
        }
        System.out.println("the answer is "+b);
    }
}
