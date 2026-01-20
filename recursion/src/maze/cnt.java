package maze;

public class cnt {
    public static void main(String[] args) {

    }
    static int mazeCount(int[][] arr,int i,int j){
        if(arr.length-1==i && arr[0].length-1==j){
            return 1;
        }
        int ans=0;
        if (i >= arr.length || j >= arr[0].length) {
            return 0;
        }
        if(arr.length-1==i){
            ans+=mazeCount(arr,i,j+1);
        }else if(arr[0].length-1==j){
            ans+=mazeCount(arr,i+1,j);
        }else{
            ans+=mazeCount(arr,i+1,j);
            ans+=mazeCount(arr,i,j+1);
        }
        return ans;
    }
    /*
    static int count(int r,int c){
        if(r==1 || c==1){
        return 1;
        }
        int left=count(r-1,c);
        int right= count(r,c-1);

        return left + right;

    }

     */
}
