import java.util.*;
public class recurringdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int rem;
        int count=0;
        while(n>0){
        rem=n%10;
        if(rem==3){
            count++;
        }
        n=n/10;
        }
        System.out.println("count is "+count);
    }
}
