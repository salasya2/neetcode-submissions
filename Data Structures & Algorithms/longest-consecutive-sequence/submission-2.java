class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;

        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            mp.put(nums[i],i);
        }

        int result=0;

        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(nums[i]-1))   continue;
            int count=1;
            int num=nums[i];
            while(mp.containsKey(num+1))
            {
                count++;
                num++;
            }
            result=Math.max(count,result);
        }
        return result;
    }
}
