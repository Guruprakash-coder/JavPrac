package midsort;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,21,1};
        arr=mergeSt(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSt(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;

        int[] left=mergeSt(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSt(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }
    static int[] merge(int[] left,int[] right){
        int[] mix=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;

            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}
/*
static int[] mergest(int[] arr){
    if(arr.length==1){
    return arr;
    }
    int mid=arr.length/2;
    int[] left=mergest(Arrays.copyofRange(arr,0,mid);
    int[] right=mergest(Array.copyofRange(arr,mid+1,arr.length);

    return merge(left,right);
}
static int[] merge(int left,int right)
{
int i=0;
int j=0;
int k=0;
int[] mix=new int[left.length+right.length];
while(i<left.length && j<right.length){
    if(left[i]<right[j]){
        mix[k]=left[i];
        i++;
    }else{
        mix[k]=right[j];
        j++;
    }
    k++;
}
 }
 */
