class Solution {
    public boolean isPalindrome(String s) {
       int n=s.length();
       
       String result = s.replaceAll("[^a-zA-Z0-9]", "");
       
       int i=0,j=result.length()-1;
       result=result.toLowerCase();
       System.out.println(result);
       while(i<=j)
       {
        if(result.charAt(i)!=result.charAt(j))
            return false;
        i++;
        j--;
       } 
       
       return true;
    }
}
