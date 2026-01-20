public class pascalsTriangle {
    public static void main(String[] args) {
        System.out.println(pascal(5));
    }
    static int pascal(int n){
        return 1<<(n-1);
    }
}
/*
1
11
121
1331
////
////
////
 */

