import java.util.Arrays;

public class search2darray {
    public static void main(String[] args) {
        int [][] arr={
                {45,87,32},
                {253,65,76,56},
                {23,54,65,34},
                {31,67,}
        };
        int key=31;
        int[] ans=search(arr,key);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==key){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
