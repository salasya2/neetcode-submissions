class Solution {
    public boolean isPalindrome(String s) {
        

        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        System.out.println(s);
        int n=s.length();
        int i=0,j=n-1;
        while(i<j)
        {
            char a=s.charAt(i);
            char b=s.charAt(j);
            if(a!=b) return false;
            i++;
            j--;
        }
        return true;
    }
}
