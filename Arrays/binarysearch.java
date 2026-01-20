import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr={21,34,64,23,55,28,98,18};
        int key=98;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                System.out.println("It is in position "+mid);
            break;
            }
            else if(key>mid){
                start=mid+1;

            }else{
                end=mid-1;
            }

        }
        if(start>end){
            System.out.println("Elemet not found");
        }
    }
}
