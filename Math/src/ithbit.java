public class ithbit {
    public static void main(String[] args) {
        System.out.println(ith(6,2));
    }
   
    static boolean ith(int n,int x){
        return (n&(1<<(x-1))) !=0;
    }
}
