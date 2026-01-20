public class magicNumber {
    public static void main(String[] args) {
        int n=10006;
        //System.out.println(magicNum(n));
        System.out.println(digits(n));
    }
    static int magicNum(int n){
        int ans=0;
        int count=1;
        while(n>0){
            ans+=(n&1)*Math.pow(5,count);
            n=n>>1;
            count++;
        }
        return ans;
    }
    static int digits(int n){
        int b=10;
        int ans =(int)(Math.log(n)/Math.log(b))+1;
        return ans;
    }
}
