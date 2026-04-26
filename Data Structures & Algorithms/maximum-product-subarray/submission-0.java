class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;

        int max_product=Integer.MIN_VALUE;


        for(int i=0;i<n;i++)
        {
            int res=nums[i];
            max_product=Math.max(max_product,res);
            for(int j=i+1;j<n;j++)
            {
                res=res*nums[j];
                max_product=Math.max(max_product,res);
            }
        }
        return max_product;


    }
}
