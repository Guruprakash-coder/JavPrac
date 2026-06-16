public class countSort {
    public static void countSort(int[] arr){
        if(arr==null || arr.length<=1){
            return;
        }
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        int[] countArray=new int[max+1];
        for(int num:arr){
            countArray[num]++;
        }
        int index=0;
        for(int i=0;i<max;i++){
            while(countArray[i]>0){
                arr[index]=i;
                index++;
                countArray[i]--;
            }
        }

    }
}
