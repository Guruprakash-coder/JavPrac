package easy;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitsum(1521));
    }
    static int digitsum(int n){
        if(n==0){
            return 0;
        }
        return n%10 +digitsum(n/10);
    }
}
