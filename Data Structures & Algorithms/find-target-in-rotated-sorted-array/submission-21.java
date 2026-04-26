class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;

        int l=0,h=n-1;
        int m=0;
        int res=-1;
        while(l<=h)
        {
            m=(l+h)/2;
            if(nums[m]==target) return m;
            
            if(nums[m]>nums[h])
            {
                if(target<nums[m] && target<=nums[h])
                    l=m+1;
                else if(target>nums[m] && target >nums[h]) l=m+1;
                else
                    h=m-1;
            }

            else
            {
                if(target>nums[m] && target <=nums[h])
                    l=m+1;
                else
                    h=m-1;
            }
            
        }
        
        return res;
    }
}
