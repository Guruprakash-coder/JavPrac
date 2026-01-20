import java.sql.SQLOutput;
import java.util.*;
public class Inputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        System.out.println("Please enter some input");
        int roll=sc.nextInt();
        System.out.println(" Your roll number is "+ roll);
        byte b=(byte)(roll);
        byte a=90;
        byte c=60;
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        int number='A';
        System.out.println(number);
        */
        char ch=sc.next().trim().charAt(0);

        if(ch>=65&&ch<91){
            System.out.println("It is an upper Case");
        }
        else if(ch>=97&&ch<123){
            System.out.println("It is an lower case");
        }else{
            System.out.println("inapprpriate character");
        }
    }
}
