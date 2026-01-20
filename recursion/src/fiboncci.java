public class fiboncci {
    public static void main(String[] args) {
        int ans=fibonaci(50);
        System.out.println(ans);
    }
    static int fibonaci(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fibonaci(n-1)+fibonaci(n-2);
    }
}
