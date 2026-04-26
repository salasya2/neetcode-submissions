class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();

        Map<Character, Integer> mp=new HashMap<>();
        int res=0;

        int count=0;
        int i=0,j=0;
        while(i<n && j<n)
        {
            if(j<n &&!mp.containsKey(s.charAt(j)))
            {
                count++;
                mp.put(s.charAt(j),j);
            }
            else
            {
                int index=mp.get(s.charAt(j));
                res=Math.max(res,count);
                while(i<n && i<=index)
                {
                    mp.remove(s.charAt(i));
                    i++;
                    count--;
                }
                count++;
                mp.put(s.charAt(j),j);

            }
            j++;
        }
        res=Math.max(res,count);
        return res;
    }
}
