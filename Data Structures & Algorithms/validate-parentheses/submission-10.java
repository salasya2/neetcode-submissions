class Solution {
    public boolean isValid(String s) {
        
        int n=s.length();
        if(n%2!=0) return false;
        Map<Character,Character> mp=new HashMap<>();

        mp.put('}','{');
        mp.put(')','(');
        mp.put(']','[');

        Stack<Character> st= new Stack<>();

        for(char c:s.toCharArray())
        {
            if(c=='{' || c== '[' || c=='(')
            {
                st.push(c);
            }
            else 
            {
                if(!st.isEmpty() && st.peek() == mp.get(c))
                 {
                    
                    System.out.println(st.peek());
                    System.out.println(c);
                     
                    st.pop();
                 }
                else
                    return false;
            }
        }
        return (!st.isEmpty())?false:true;


    }
}
