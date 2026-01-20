package easy;

public class ntoone {
    public static void main(String[] args) {
        repeat(5);
    }
    static void repeat(int n){
        if(n==0){
            return;
        }
        repeat(n-1);
        System.out.println(n);

    }
}
