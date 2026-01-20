import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={23, 45, 64, 21, 17, 87, 23};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] matrix){
        for(int i=0;i<matrix.length;i++){
            boolean swapped=false;
            for(int j=1;j<matrix.length-i;j++){
                if(matrix[j]<matrix[j-1]){
                    int temp=matrix[j];
                    matrix[j]=matrix[j-1];
                    matrix[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
