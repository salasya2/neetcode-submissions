class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> mp= new HashSet<>();
        for(int i=0;i<n;i++)
        {
            mp.add(nums[i]);
        }
        
        int res=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            if(mp.contains(nums[i]-1))
                continue;
            int num=nums[i];            
            while(mp.contains(num))
            {
                count++;
                num++;
                res=Math.max(res,count);
            }
            res=Math.max(res,count);
        }
        return res;        
    }

}
