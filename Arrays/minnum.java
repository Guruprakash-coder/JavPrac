public class minnum {
    public static void main(String[] args) {
        int[] arr={35,92,33,23,12,32};
        System.out.println(minnum(arr));
    }
    static int minnum(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }

        }
        return min;
    }
}
