package easy;

public class productofDigits {
    public static void main(String[] args) {
        System.out.println(digitmul(1525));
    }
    static int digitmul(int n){
        if(n==0){
            return 1;
        }
        return n%10 *digitmul(n/10);
    }
}
