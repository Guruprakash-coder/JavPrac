import java.sql.SQLOutput;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Stack<Integer> s=new Stack<>();
//
//
//        s.push(32);
//        s.push(92);
//        s.push(22);
//        s.push(2);
//        s.push(321);
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
        Queue<Integer> q=new LinkedList<>();
        q.add(3);
        q.add(6);
        q.add(7);
        q.add(19);
        q.add(22);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}