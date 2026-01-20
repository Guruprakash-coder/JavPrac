import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        factors3(20);
    }
//    static void factors(int n){
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                System.out.println(i);
//            }
//        }
//    }

    //o(sqrt(n))
//    static void factors(int n){
//        for(int i=1;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                if(n%i==i){
//                    System.out.print(i+" ");
//                }else{
//                    System.out.print(i+" "+n/i+" ");
//                }
//
//            }
//        }
//    }
    static void factors3(int n){
        ArrayList<Integer> store=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){

            if(n%i==0){
                if(n%i==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" ");
                    store.add(n/i);
                }
            }
        }
        for(int i=store.size()-1;i>=0;i--){
            System.out.print(store.get(i)+" ");
        }
    }


}
