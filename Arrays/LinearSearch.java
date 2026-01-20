import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={23,48,76,9,82,78};
        System.out.println(linearSearch(arr,78));

    }
    static int linearSearch(int[] arr,int key){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
