class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;

        int l=0,h=n-1;
        int m=0;
        while(l<h)
        {
            m=(l+h)/2;

            if(nums[l]<nums[m])
            {
                if(nums[m]<nums[h]) 
                    h=m-1;
                else
                    l=m;
            }
            else
            {
                if(nums[m]>nums[h])
                    l=m+1;
                else
                    h=m;
            }

        }
        return nums[l];

    }
}
