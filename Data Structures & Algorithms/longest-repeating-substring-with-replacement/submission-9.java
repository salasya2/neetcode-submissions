class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();

        int res=0;

        Map<Character, Integer> mp = new HashMap<>();

        int i=0,j=0;
        int count=0,max_idx=0;
        while(i<n && j<n)
        {
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            if(mp.get(s.charAt(j))>=count)
            {
                max_idx=j;
                count=mp.get(s.charAt(j));
            }
            
            int len =j-i+1;
            int cont=count+k;
            // System.out.println(count+" "+k+" "+len+" continuous: "+cont+"Res :"+res);            
            if(count+k>=j-i+1)
            {
                res=Math.max(j-i+1,res);
            }
            else if(count + k < j-i+1)
            {
                if(s.charAt(max_idx)==s.charAt(i)) count--;
                mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                i++;
            }
            
            j++;
        }
        return res;
    }
}
