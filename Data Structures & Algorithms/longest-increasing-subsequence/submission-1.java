class Solution {
    private int[][] dp;
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        dp=new int[n][n+1];
        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }
        return dfs(nums,0,-1);
    }

    private int dfs(int[] nums,int i, int j)
    {
        if(i==nums.length) return 0;
        if(dp[i][j+1]!=-1)
            return dp[i][j+1];

        int len= dfs(nums,i+1,j);

        if(j==-1 || nums[j]<nums[i])
        {
            len=Math.max(1+dfs(nums,i+1,i),len);
        }
        dp[i][j+1]=len;
        return len;
    }
}
