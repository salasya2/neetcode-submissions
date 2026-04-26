class Solution {
    public boolean isAnagram(String s, String t) {
        int len_s=s.length();
        int len_t=t.length();

        if(len_s!=len_t)
            return false;
        
        Map<Character,Integer> mp=new HashMap<>();
        for(char c: s.toCharArray())
        {
             mp.put(c,mp.getOrDefault(c,0)+1);
        }

        for(char c:t.toCharArray())
        {
            mp.put(c,mp.getOrDefault(c,0)-1);
        }
        
        for(Map.Entry<Character,Integer> entry: mp.entrySet())
        {
            int val=entry.getValue();
            if(val!=0)
                return false;
        }

        return true;
    }
}
