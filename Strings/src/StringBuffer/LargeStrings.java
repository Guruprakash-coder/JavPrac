package StringBuffer;

import java.util.Random;

public class LargeStrings {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer();
        buffer.append("Guruprakash");
        String str= buffer.toString();
        buffer.append(4);
        buffer.insert(2,"rahul");
        System.out.println(buffer.capacity());
        System.out.println(buffer.length());
        System.out.println(buffer);
        Random r=new Random();
        System.out.println((int)(r.nextFloat()*26));
    }
}
