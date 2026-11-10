class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[n+1];
        dp[0]=0;

        for(int i=1;i<=n;i++){
            dp[i]=Integer.MAX_VALUE;

            for(int k=1;k<=3;k++){
                if(i-k>=0){
                    int prevCost=dp[i-k];
                    int currentStepCost=costs[i-1];
                    int jumpCost=k*k;

                    dp[i]=Math.min(dp[i], prevCost+currentStepCost+jumpCost);
                }
            }
        }
        return dp[n];
    }
}