public class max2darray {
    public static void main(String[] args) {
        int [][] arr={
                {45,87,32},
                {253,65,76,56},
                {23,54,65,34},
                {31,67}
        };
        System.out.println(max(arr));



    }
    static int max(int[][] arr){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
