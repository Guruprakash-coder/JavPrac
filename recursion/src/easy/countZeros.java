package easy;

public class countZeros {
    public static void main(String[] args) {
        System.out.println(zero(30000));
    }
    static int zero(int n){
        return helper(n,0);
    }
    static int helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);

    }
}
