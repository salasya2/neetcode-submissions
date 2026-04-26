class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
       
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
              continue;
            int low=i+1;
            int high=n-1;
            while(low<high)
            {
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0)
                {
                    res.add(List.of(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(high>low && nums[high]==nums[high+1]) high--;
                }
                else if(sum>0) high--;
                else low++;
                
            }
        }
        return res;
    }
}
