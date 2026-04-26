class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        Map<Character,Character> mp=new HashMap<>();
        mp.put(')','(');
        mp.put('}','{');
        mp.put(']','[');
        for(char c:s.toCharArray())
        {
            
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
                System.out.println("char : "+c);
            }
            else
            {
                if(!st.isEmpty() && st.peek() == mp.get(c))
                {
                    
                        System.out.println("char : "+c);
                        System.out.println("char : "+st.peek());                    
                        st.pop();
                }
                else
                    return false;  
            }
        }
        return (st.isEmpty())?true:false;
    }
}
