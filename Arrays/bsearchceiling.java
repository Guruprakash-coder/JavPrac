public class bsearchceiling {

    public static void main(String[] args) {
        //int[] arr={12,34,45,57,59,67,78,90};
        int[] arr={90,87,78,69,65,45,43,32};
        int target=66;

        int ans=oabs(arr,target);
        System.out.println(ans);
    }
    static int oabs(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc=arr[start]<arr[end];


        while(start <= end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }
        return start;
    }
    }


