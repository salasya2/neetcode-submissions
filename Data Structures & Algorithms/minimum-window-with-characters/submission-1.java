class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(m==0) return "";
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:t.toCharArray())
        {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> win=new HashMap<>();
        int have=0,need=mp.size();
        int resLen=Integer.MAX_VALUE;
        int start=0;
        int []res={-1,-1};
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            win.put(c,win.getOrDefault(c,0)+1);

            if(mp.containsKey(c) && mp.get(c).equals(win.get(c)))
            {
                have++;
            }

            while(have == need)
            {
                if(i-start+1<resLen)
                {
                    resLen=i-start+1;
                    res[0]=start;
                    res[1]=i;
                }

                char startChar=s.charAt(start);
                win.put(startChar,win.get(startChar)-1);
                if(mp.containsKey(startChar) && win.get(startChar)<mp.get(startChar))
                    have--;
                start++;
            }
        }

        return resLen==Integer.MAX_VALUE?"":s.substring(res[0],res[1]+1);

    }
}
