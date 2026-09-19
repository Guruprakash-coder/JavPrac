import java.lang.reflect.Array;
import java.util.Arrays;

public class CountsSubsetswithSumK {
    public int countPartitions(int n,int d,int[] arr){
        int tot=0;
        for(int num:arr){
            tot+=num;
        }
        if(tot-d<0 || (tot-d)%2!=0) return -1;
        return count(arr,(tot-d)/2);
    }
    public int count(int[] arr,int k){
        int[][] dp=new int[arr.length][k+1];
        for(int i=0;i<arr.length;i++){
            dp[i][0]=1;
        }
        dp[0][arr[0]]+=1;
        for(int i=1;i<arr.length;i++){
            for(int sum=0;sum<=k;sum++){
                int notake=dp[i-1][sum];
                int take=0;
                if(sum>=arr[i]) take=dp[i-1][sum-arr[i]];
                dp[i][sum]=take+notake;
            }
        }
        return dp[arr.length-1 ][k];
    }
//    public int count(int[] arr,int k){
//        int[][] dp=new int[arr.length][k+1];
//        for(int[] d:dp){
//            Arrays.fill(d,-1);
//        }
//        return f(arr,arr.length-1,k,dp);
//    }
//    private int f(int[] arr,int ind,int sum,int[][] dp){
//        if(ind==0){
//            if(sum==arr[0]) return 1;
//            return 0;
//        }
//        if(sum==0) return 1;
//        if(dp[ind][sum]!=-1) return dp[ind][sum];
//        int notake=f(arr,ind-1,sum,dp);
//        int take=0;
//        if(sum>=arr[ind]) take=f(arr,ind-1,sum-arr[ind],dp);
//        return dp[ind][sum]=notake+take;
//    }
}
