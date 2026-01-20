public class leet {
    public static void main(String[] args) {
        int[] arr={3,4,6,7,2,3};
        int[] ans=shuffle(arr,5);

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] newarr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int j=n+i;
            for(int z=0;i<=nums.length;z+=2){
                newarr[i]=nums[i];
                newarr[i+1]=nums[j];
            }

        }
        return newarr;

    }
}
