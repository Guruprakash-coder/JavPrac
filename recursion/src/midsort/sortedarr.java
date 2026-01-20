package midsort;

public class sortedarr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] arr2={3,4,2,34,67,89};
        System.out.println(isSorted(arr,0));
        System.out.println(isSorted(arr2,0));
    }
    static boolean isSorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }else{
            return isSorted(arr,i+1);
        }
        // (or) return arr[index]<arr[index+1] && sorted(arr,index+1);

    }
}
