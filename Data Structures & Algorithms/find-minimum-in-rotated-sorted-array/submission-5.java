class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;

        int low=0,high=n-1;
        int index=0;


        while(low<=high)
        {
            int m=(low+high)/2;
            if(nums[m]>nums[high] && nums[low]<nums[m])
            {
                low=m;
            }
            else if(nums[m]<nums[low])
                high=m;

            else if(m>0 && nums[m]<nums[m-1])
            {   
                index=m;
                high=m-1;
            }
            else
                low=m+1;
        }
        return nums[index];

    }
}
