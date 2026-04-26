class Solution {
    public int lengthOfLIS(int[] nums) {
        return dfs(nums,0,-1);
    }

    private int dfs(int[] nums,int i, int j)
    {
        if(i==nums.length) return 0;

        int len= dfs(nums,i+1,j);

        if(j==-1 || nums[j]<nums[i])
        {
            len=Math.max(1+dfs(nums,i+1,i),len);
        }
        return len;
    }
}
