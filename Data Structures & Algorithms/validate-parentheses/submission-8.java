class Solution {
    public boolean isValid(String s) {
        
        int n=s.length();
        if(n%2!=0) return false;
        Map<Character,Character> mp=new HashMap<>();

        mp.put('{','}');
        mp.put('(',')');
        mp.put('[',']');

        Stack<Character> st= new Stack<>();

        for(char c:s.toCharArray())
        {
            if(c=='{' || c== '[' || c=='(')
            {
                st.push(c);
            }
            else 
            {
                if(!st.isEmpty()){

                  char t= st.pop();
                  if(c==mp.get(t))
                    continue;
                  return false;
                }
                else
                    return false;
            }
        }
        return st.isEmpty()==false?false:true;


    }
}
