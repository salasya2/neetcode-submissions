class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        int rob1=0;
        int rob2=0;
        if(n==1) return nums[0];
        for(int i=0;i<n-1;i++)
        {
            int temp=Math.max(nums[i]+rob1,rob2);
            rob1=rob2;
            rob2=temp;
        }
        int rob3=0;
        int rob4=0;
        for(int i=1;i<n;i++)
        {
            int temp=Math.max(rob3+nums[i],rob4);
            rob3=rob4;
            rob4=temp;
        }
        return Math.max(rob2,rob4);

    }
}
