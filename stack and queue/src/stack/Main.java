package stack;

public class Main {
    public static void main(String[] args) throws StackException {
        cusstack s=new cusstack(5);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(7);
        s.push(934);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
//        System.out.println(s.pop());


    }
}
