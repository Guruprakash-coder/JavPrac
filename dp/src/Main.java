import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public boolean canCross(int[] stones) {
        int[] dp=new int[stones.length+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        return helper(stones,dp,stones.length-1)!=-1;
        //return dp[stones.length-1]!=0;
    }
    private int helper(int[] stones,int[] dp,int i){
        if(dp[i]!=-1){
            return dp[i];
        }
        int left=helper(stones,dp,i-1)+Math.abs(stones[i]-stones[i-1]);
        int right=i>1?(helper(stones,dp,i-2)+Math.abs(stones[i]-stones[i-2])):Integer.MAX_VALUE;
        dp[i]=Math.min(left,right);
        System.out.println(Arrays.toString(dp));
        return dp[i];

    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}