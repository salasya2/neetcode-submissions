class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
       Map<Character,Integer> mp=new HashMap<>();
       int count=0;
       int res=0;
       int start=0;
       int index=0;
       for(int i=0;i<n;i++)
       {
          mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
         
            count=Math.max(mp.get(s.charAt(i)),count);
         

          if(count+k<i-start+1)
          {
            mp.put(s.charAt(start),mp.get(s.charAt(start))-1);
            
            start++;
          }
          else
            res=Math.max(res,i-start+1);
       }
       return res;
        
    }
}
