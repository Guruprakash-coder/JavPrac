public class reversing {
    public static void main(String[] args) {
        int n=3456;
        int reve=0;
        while(n>0){
            int rem=n%10;
            reve=(reve*10)+rem;
            n=n/10;

        }
        System.out.println(reve);
    }
}
