import java.sql.SQLOutput;
import java.util.*;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String Fruit=sc.next();
//        switch (Fruit) {
//            case "apple" -> System.out.println("A red Fruit");
//            case "mango" -> System.out.println("King of fruits");
//            case "orange" -> System.out.println("An orange fruit ");
//            default -> System.out.println("May or may not be a fruit");
//        }
        int empno=sc.nextInt();
        String dept=sc.next();
        switch (empno) {
            case 1 -> System.out.println("Guruprakash");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Employee number 3");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }

    }
}
