import java.math.BigInteger;

public class factorial {
    static BigInteger fact(int n){
        BigInteger ans=new BigInteger("1");
        for(int i=2;i<=n;i++){
            ans=ans.multiply(BigInteger.valueOf(i));
        }

        return ans;
    }

    public static void main(String[] args) {
        BigInteger s=fact(100);
        System.out.println(s);
        BD();
    }
    static void BD(){
        double x=0.03;
        double y=0.04;
        double ans=y-x;
        System.out.println(ans);
    }
}
