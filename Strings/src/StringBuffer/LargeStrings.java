package StringBuffer;

public class LargeStrings {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer();
        buffer.append("Guruprakash");
        String str= buffer.toString();
        buffer.append(4);
        buffer.insert(2,"rahul");
        buffer.replace(0,buffer.length(),"hello");
        System.out.println(buffer);

    }
}
