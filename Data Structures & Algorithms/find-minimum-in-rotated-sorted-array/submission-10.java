class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;

        int l=0,h=n-1;
        int m=0;
        while(l<h)
        {
            m=(l+h)/2;

           if(nums[m]<nums[h])
           {
            h=m;
           }
           else
            l=m+1;

        }
        return nums[l];

    }
}
