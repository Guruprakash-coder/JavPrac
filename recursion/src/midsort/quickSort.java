package midsort;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        QuickSt(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    static void QuickSt(int[] arr,int low,int high){
        if(low>=high){
            return;
        }

        int s=low;
        int e=high;

        int mid=(s+e)/2;
        int pivot=arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        QuickSt(arr,low,e);
        QuickSt(arr,s,high);

    }
}
