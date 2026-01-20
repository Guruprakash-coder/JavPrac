import static java.lang.Math.PI;

public class PrettyPrinting {
    public static void main(String[] args) {
//        float a=3.1443562f;
//
//        System.out.printf("Formatted number is %.2f",a);
//        //System.out.printf(PI);
//        System.out.printf(" \n pie:%.3f",Math.PI);
//        System.out.printf("Hello my name is");
//
        String alphabets="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            alphabets+=ch;
        }
        System.out.println(alphabets);

    }
}
