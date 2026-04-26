class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            mp.put(nums[i],i);
        }

        int[] res=new int[2];

        for(int i=0;i<n;i++)
        {
            int rem= target-nums[i];

            if(mp.containsKey(rem))
            {
                int indx=mp.get(rem);
                if(i!=indx)
                {
                    res[0]=i;
                    res[1]=indx;
                    return res;
                }
            }
        }
        return res;
    }
}
