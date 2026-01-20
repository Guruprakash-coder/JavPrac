public class nine {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        //int OriginalN=n;
        n=2*n;
        for(int i=0;i<=n;i++){

            for(int j=0;j<=n;j++){
                int num=Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
