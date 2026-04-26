class Solution {
    public String longestPalindrome(String s) {
        
        int n=s.length();


        int resLen=0;
        String res="";

        for(int i=0;i<n;i++)
        {
            //odd length
            int l=i,r=i;
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>resLen)
                {
                    resLen=r-l+1;
                    res=s.substring(l,l+resLen);
                }
                l--;
                r++;
            }

            //even length
            l=i;
            r=i+1;
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>resLen)
                {
                    resLen=r-l+1;
                    res=s.substring(l,l+resLen);
                }
                l--;
                r++;
            }
        }
        return res;
    }
}
