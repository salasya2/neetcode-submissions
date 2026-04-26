class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            List<Integer> temp=new ArrayList<>();
            temp.add(nums[i]);
            find(nums,target-nums[i],i,temp);
            
        }
        return res;
    }
    public void find(int[] nums,int rem, int index, List<Integer> temp)
    {
        if(rem<0) return;
        if(rem==0)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            temp.add(nums[i]);

            find(nums,rem-nums[i],i,temp);
            temp.remove((Integer)nums[i]);
        }


    }
}
