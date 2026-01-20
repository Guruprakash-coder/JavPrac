public class second {
    public static void main(String[] args) {
        //pattern(5);
        //System.out.println();
        pattern(10);
    }
    static void pattern(int n){
        for(int i=0;i<n;i++){
            //int dummy=i+1;
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
