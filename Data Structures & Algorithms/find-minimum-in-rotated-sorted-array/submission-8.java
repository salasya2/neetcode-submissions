class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0, h=n-1;
        while(l<=h)
        {
            int m=(l+h)/2;

            if(m>0 && nums[m-1]>nums[m])
            {
                return nums[m];

            }
            else if(nums[m]<nums[h])
                h=m-1;
            else
                l=m+1;

        }
        return nums[0];
    }
}
