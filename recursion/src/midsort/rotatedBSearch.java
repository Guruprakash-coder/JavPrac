package midsort;

public class rotatedBSearch {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(rbs(arr,8,0,arr.length-1));
    }
    static int rbs(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>=arr[start]){
            if(target>=arr[start] && target<=arr[mid]){
                return rbs(arr,target,start,mid-1);
            }else{
                return rbs(arr,target,mid+1,end);
            }
        }else{
            if(target>arr[mid] && target  <= arr[end]){
                return rbs(arr,target,mid+1,end);
            }else{
                return rbs(arr,target,start,mid-1);
            }
        }


    }
}
