public class maximumitem {
    public static void main(String[] args) {
        int[] arr={1,3,4,32,54};
        System.out.println(max(arr));
        System.out.println(maxrange(arr,1,3));
    }


    static int maxrange(int[] arr,int a,int b){
        if(b>a){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int max=arr[a];
        for(int i=a;i<=b;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
