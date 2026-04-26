class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;

        int[] dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;

        for(int i=1;i<=amount;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                if(coins[j]>i) continue;

                else if(coins[j]==i)
                {
                    dp[i]=1;
                }
                else
                {
                    int rem=i-coins[j];
                    if(dp[rem]!=Integer.MAX_VALUE)
                        dp[i]=Math.min(dp[rem]+1,dp[i]);
                }

            }
        }
        return (dp[amount]!=Integer.MAX_VALUE)?dp[amount]:-1;


    }
}
