public class palindrome {
    public static void main(String[] args) {
        String word="malayalam";
        String rev="";
        for(int i=word.length()-1;i>=0;i--){
            rev+=word.charAt(i);
        }
        if(rev.equals(word)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
