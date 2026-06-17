import java.util.Arrays;

public class RadixSort {
    public static void radic(int[] arr){
        int max= Arrays.stream(arr).max().getAsInt();


        for(int exp=1;max/exp>0;exp=exp*10){
            countSort(arr,exp);
        }
    }
    private static void countSort(int[] arr,int exp){

    }
}
