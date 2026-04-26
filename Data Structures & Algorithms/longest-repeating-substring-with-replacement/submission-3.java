class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
       int[] mp=new int[26];
       int count=0;
       int res=0;
       int start=0;
       int index=0;
       for(int i=0;i<n;i++)
       {
          mp[s.charAt(i)-'A']++;
         
            count=Math.max(mp[s.charAt(i)-'A'],count);
         

          if(count+k<i-start+1)
          {
            mp[s.charAt(start)-'A']--;            
            start++;
          }
          else
            res=Math.max(res,i-start+1);
       }
       return res;
        
    }
}
