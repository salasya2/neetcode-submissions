class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Set<Character> mp=new HashSet<>();
        int res=0;
        int i=0,j=0;
        int count=0;
        while(i<n && j<n)
        {
            char start=s.charAt(j);
            while(i<n && !mp.contains(s.charAt(i)))
            {
                mp.add(s.charAt(i));
                count++;
                i++;
            }
            if(i<n && j<n)
             System.out.println("Count : "+count+" "+" Start : "+s.charAt(j)+" "+"Current : "+s.charAt(i));
            res=Math.max(count,res);
            count--;
            mp.remove(start);
            j++;
        }
        res=Math.max(count,res);
        return res;
    }

}
