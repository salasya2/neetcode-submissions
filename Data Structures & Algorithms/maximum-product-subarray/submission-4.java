class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;

        int max_product=Integer.MIN_VALUE;

        int curr_Max=1, curr_Min=1;
        for(int i=0;i<n;i++)
        {
            

            int temp=curr_Max*nums[i];

            curr_Max=Math.max(Math.max(curr_Max*nums[i],curr_Min*nums[i]),nums[i]);
            curr_Min=Math.min(Math.min(temp,curr_Min*nums[i]),nums[i]);

            max_product=Math.max(curr_Max,max_product);

        }
        return max_product;


    }
}
