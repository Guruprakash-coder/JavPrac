import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.Format;

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
        BigDecimal x=new BigDecimal("0.03342543235425343543543");
        BigDecimal y=new BigDecimal("0.049823489987432896749367");
        BigDecimal ans=y.subtract(x);

        System.out.println(ans);
        System.out.println(ans.pow(98890));
    }
}
