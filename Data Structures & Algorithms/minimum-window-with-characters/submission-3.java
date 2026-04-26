class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[] res=new int[]{-1,-1};
        int resLen=Integer.MAX_VALUE;
        Map<Character,Integer> win=new HashMap<>();
        Map<Character,Integer> mp=new HashMap<>();
        
        for(int i=0;i<m;i++)
        {
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        }
        int need =mp.size();
        int have =0,start=0;
        for(int i=0;i<n;i++)
        {
            char c= s.charAt(i);
            win.put(c,win.getOrDefault(c,0)+1);

            if(mp.containsKey(c) && mp.get(c).equals(win.get(c)))  have++;

            while(have==need)
            {
                if(i-start+1 < resLen)
                {
                    resLen=i-start+1;
                    res[0]=start;
                    res[1]=i;
                }
                char startChar= s.charAt(start);
                win.put(startChar, win.get(startChar)-1);
                if(mp.containsKey(startChar)&& mp.get(startChar)>win.get(startChar)) have--;
                start++;
            }
        }

        return (resLen==Integer.MAX_VALUE)?"":s.substring(res[0],res[1]+1);
    }
    // public boolean check(String t, Map<Character, Integer>win)
    // {
    //     int m=t.length();

    //     for(int i=0;i<m;i++)
    //     {
    //         if(!win.containsKey(t.charAt(i)))
    //             return false;
    //     }
    //     return true;
    // }
}
