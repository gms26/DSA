// Last updated: 5/25/2026, 11:10:15 AM
class Solution {
    public int coinChange(int[] coins, int amount) {
        // int dp[][]=new int[coins.length+1][amount+1];
        // for(int j=1;j<=amount;j++){
        //     dp[0][j]=amount+1;
        // }
        // for(int i=1;i<=coins.length;i++){
        //     for(int j=1;j<=amount;j++){
        //         if(coins[i-1]>j){
        //             dp[i][j]=dp[i-1][j];
        //         }
        //         else{
        //             dp[i][j]=Math.min(dp[i-1][j],dp[i][j-coins[i-1]]+1);
        //         }
        //     }
        // }
        // if(dp[coins.length][amount]==amount+1)return -1;
        // return dp[coins.length][amount]
        int[]dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
         dp[0] = 0;

        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}