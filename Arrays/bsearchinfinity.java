public class bsearchinfinity {
    public static void main(String[] args) {
        int[] arr={12,23,32,34,36,45,48,51,54,57,58,59,63,67,69,70,74,86};
        int ans=findRange(arr,45);
        System.out.println(ans);
    }
    static int findRange(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return bsearch(arr,target,start,end);

    }
    static int bsearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
