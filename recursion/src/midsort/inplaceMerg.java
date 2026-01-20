package midsort;

public class inplaceMerg {
    public static void main(String[] args) {

    }
    static  void mergest(int[] arr,int s,int e){
        if(e-s==1){
            return ;
        }
        int mid=(s+e)/2;

        mergest(arr,s,mid);
        mergest(arr,mid,e);

        merge(arr,s,mid,e);
    }

    static int[] merge(int[] arr,int s,int mid,int e ){
        int[] mix= new int[e-s];
        int i=s;
        int j=mid;
        int k=e;
        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;

            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){

        }
        return arr;
    }
}
