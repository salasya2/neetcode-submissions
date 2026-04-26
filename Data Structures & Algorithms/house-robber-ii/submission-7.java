public class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if (nums.length == 1) return nums[0];
        int[][] memo=new int[n][2];

        memo[0][1]=nums[0];
        memo[0][0]=0;

        if(n>1)
        {
            memo[1][1]=Math.max(nums[0],nums[1]);
            memo[1][0]=nums[1];
        }

        for(int i=2;i<n;i++)
        {
            if(i!=n-1)
            {
                memo[i][1]=Math.max(memo[i-1][1],nums[i]+memo[i-2][1]);
            }
            
            memo[i][0]=Math.max(memo[i-1][0],nums[i]+memo[i-2][0]);

        }
        memo[n-1][1]=memo[n-2][1];
        for(int i=0;i<n;i++)
        {
            System.out.print(memo[i][1]+" ");
            
        }
        System.out.println();
        for(int i=0;i<n;i++)
            System.out.print(memo[i][0]+" ");
        return Math.max(memo[n-1][1],memo[n-1][0]);
        
    }
    
    


}