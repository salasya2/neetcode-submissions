class Solution {
    private int[] memo;
    public int rob(int[] nums) {
        
        int n=nums.length;
        memo=new int[n];
        
        memo[0]=nums[0];
        if(n>1) memo[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++)
        {
            memo[i]=Math.max(memo[i-1],memo[i-2]+nums[i]);
        }
        return memo[n-1];

    }
    
}
