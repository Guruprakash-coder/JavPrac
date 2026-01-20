package midsort;

public class bubbleSort {
    public static void main(String[] args) {

    }
    static void bbSort(int[] arr,int x,int y){
        if(x==0){
            return;
        }
        if(y==x){
            bbSort(arr,x-1,0);
            return;
        }
        if(y<arr.length-1&&arr[y]>arr[y+1]){
            swap(arr,y,y+1);
            bbSort(arr,x,y+1);
        }
        bbSort(arr,x,y+1);


    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }

}
