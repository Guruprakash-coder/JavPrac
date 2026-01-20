public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int result = bsearch(arr, target, 0, arr.length - 1);
        System.out.println(result+1);
    }
    static int bsearch(int[] arr,int target,int start,int end ){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(target>arr[mid]){
            return bsearch(arr,target,mid+1,end);
        }else{
            return bsearch(arr,target,start,mid-1);
        }

    }
}
