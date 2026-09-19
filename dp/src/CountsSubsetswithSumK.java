import java.lang.reflect.Array;
import java.util.Arrays;

public class CountsSubsetswithSumK {
    public int count(int[] arr,int k){
        int[][] dp=new int[arr.length][k+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return f(arr,arr.length-1,k,dp);
    }
    private int f(int[] arr,int ind,int sum,int[][] dp){
        if(ind==0){
            if(sum==arr[0]) return 1;
            return 0;
        }
        if(sum==0) return 1;
        if(dp[ind][sum]!=-1) return dp[ind][sum];
        int notake=f(arr,ind-1,sum,dp);
        int take=0;
        if(sum>=arr[ind-1]) take=f(arr,ind-1,sum-arr[ind-1],dp);
        return dp[ind][sum]=notake+take;
    }
}
