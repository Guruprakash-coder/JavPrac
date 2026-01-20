package midsort;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={1,2,43,54,34,9,2,76,21};
        slSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void slSort(int[] arr,int x,int y,int max){
        if(x==0){
            return;
        }
        if(y==x){

                int temp=arr[max];
                arr[max]=arr[x-1];
                arr[x-1]=temp;
                slSort(arr,x-1,0,0);

            slSort(arr,x-1,0,0);
            return;
        }
        if(arr[max]<arr[y]){
            slSort(arr,x,y+1,y);
        }else {
            slSort(arr, x, y + 1, max);
        }

    }
}


//(or)
