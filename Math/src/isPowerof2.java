public class isPowerof2 {
    public static void main(String[] args) {
        System.out.println(verify(8));
        aPowerb(3,6);
    }
    static void  aPowerb(int a,int b){
        int ans=1;
        while(b>0){
            if((b&1)==1){
                ans*=a;
            }
            a*=a;
            b=b>>1;
        }
        System.out.println(ans);
    }
    static boolean verify(int n){

        return (n&(n-1))==0;
    }
}
//q-13 rewatch
