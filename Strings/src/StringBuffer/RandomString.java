package StringBuffer;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomString {
    static String generate(int size){
        StringBuffer sb=new StringBuffer();
        Random r=new Random();
        for(int i=0;i<size;i++){
            int randomchar=97+(int)(r.nextFloat()*26);
            sb.append((char)randomchar);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n=20;
        String nae=generate(n);
        System.out.println(nae);
        DecimalFormat df=new DecimalFormat("0000.0000");
        System.out.println(df.format(32));
    }
}
