public class sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40,3));
    }
    static double sqrt(int n,int p){
        int start=0;
        int end=n;
        double root=0.0;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid>=n){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        root=end;
        double incr=0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr=incr/10;
        }

        return root;
    }
}
