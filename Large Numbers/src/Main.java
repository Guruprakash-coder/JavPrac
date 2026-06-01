import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a=30;
        int b=67;
        BigInteger A=BigInteger.valueOf(378779883);
        BigInteger B=new BigInteger("75643786768764796347934565976343975354");
        BigInteger C=BigInteger.valueOf(5435);
        BigInteger D=BigInteger.TEN;
        BigInteger E=new BigInteger("84398763589673985989798598895453");
        BigInteger ans=E.multiply(B);

        BigInteger S=A.add(B);
        System.out.println(S);
        System.out.println(D);
        System.out.println(ans);
    }
}