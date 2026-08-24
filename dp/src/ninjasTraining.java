import java.util.Arrays;

public class ninjasTraining {
    int ninjaTraining(int n,int[][] points){
        int dp[][]=new int[n][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(n-1,3,points,dp);
    }
    int f(int day,int last,int[][] points,int[][] dp){
        if(day==0){
            int maxi=0;
            for(int i=0;i<3;i++){
                if(i==last) continue;
                maxi=Math.max(maxi,points[0][i]);
            }
            return maxi;
        }
        if(dp[day][last]!=-1) return dp[day][last];
        int maxi=0;
        for(int i=0;i<3;i++){
            if(i!=last){
                int point=points[day][i]+f(day-1,i,points,dp);
                maxi=Math.max(maxi,point);
            }
        }


        return dp[day][last]=maxi;
    }
}
