package easy;

public class reverseaNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1841));
    }
    static int reverse(int n){
        if(n/10==0){
            return n;
        }
        return ((n%10)*digCount(n)) + reverse(n/10);
    }
    static int digCount(int n){
        int count=0;
        int mul=1;
        while(n>0){
            count++;
            n=n/10;
        }
        for(int i=1;i<count;i++){
            mul*=10;
        }
        return mul;
    }
}
