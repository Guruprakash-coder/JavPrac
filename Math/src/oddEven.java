public class oddEven {
    public static void main(String[] args) {
        System.out.println(isOdd(8));
    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }

}
