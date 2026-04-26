class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(nums[i],i);
        }
        for(int i=0;i<n;i++)
        {
            int rem=target-nums[i];
            if(mp.containsKey(rem) )
            {
                int index=mp.get(rem);
                if(index!=i)
                    return new int[]{i,index};
            }
        }
        return new int[]{};
    }
}
