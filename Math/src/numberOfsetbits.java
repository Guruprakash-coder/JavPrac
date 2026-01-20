public class numberOfsetbits {
    public static void main(String[] args) {
        System.out.println(setBitsCount(15));
    }
    /*static int setBitsCount(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }*/
    static int setBitsCount(int n){
        int count=0;
        while(n>0){
            count++;
            n-=(n& -n);
        }

        return count;
    }
}












