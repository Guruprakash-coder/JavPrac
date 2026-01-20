import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> newlist=new ArrayList<>(10);

        Scanner sc=new Scanner(System.in);
        newlist.add(10);
        newlist.add(938);

        System.out.println(newlist);
        newlist.add(2,30);
        newlist.set(0,99);
        System.out.println(newlist);
        for(int i=0;i<=10;i++){
            newlist.add(sc.nextInt());
        }
    }
}
