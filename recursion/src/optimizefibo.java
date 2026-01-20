public class optimizefibo {
    public static void main(String[] args) {
        long ans=fib(95);
        System.out.println(ans);
    }
    static long fib(int n){
        return (long)((Math.pow(((1+ Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }


}
