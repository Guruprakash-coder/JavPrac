import java.util.Arrays;

public class ninjasTraining {
    int ninjaTraining(int n,int[][] points){
        StringBuilder sb=new StringBuilder();
        
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
    int ninjaTrainingTabulation(int n,int[][] points){
        int[][] dp=new int[n][4];
        dp[0][0]=Math.max(points[0][1],points[0][2]);
        dp[0][1]=Math.max(points[0][0],points[0][2]);
        dp[0][2]=Math.max(points[0][1],points[0][0]);
        dp[0][3]=Math.max(points[0][0],Math.max(points[0][1],points[0][2]));
        for(int day=1;day<n;day++){
            for(int last=0;last<4;last++){
                dp[day][last]=0;
                int maxi=0;
                for(int task=0;task<3;task++){
                    if(task!=last){
                        int point=points[day][task]+dp[day-1][task];
                        maxi=Math.max(maxi,point);
                    }

                }
                dp[day][last]=maxi;
            }
        }
        return dp[n-1][3];
    }
}
