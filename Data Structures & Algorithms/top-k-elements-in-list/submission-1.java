class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> mp=new HashMap<>();

        int n=nums.length;
        List<Integer> freq[] =new List[n+1];
        for(int i=0;i<n+1;i++)
        {
            freq[i]=new ArrayList<>();
        }
        for(int i :nums)
        {
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet())
        {
            freq[entry.getValue()].add(entry.getKey());
        }
        int res[] =new int[k];
        int index=0;
        for(int i=freq.length-1;i>0 && index<k;i--)
        {
            for(int num :freq[i])
            {
                res[index++]=num;
                if(index==k) return res;
            }

        }
        return res;


    }
}
