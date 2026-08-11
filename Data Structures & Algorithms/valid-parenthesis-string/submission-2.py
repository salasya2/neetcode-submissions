class Solution:
    def checkValidString(self, s: str) -> bool:
        n = len(s)

        

        st =[]
        star= []

        for i,c in enumerate(s):

            if c == '(':
                st.append(i)
            elif c == '*':
                star.append(i)
            else:
                if st:
                    st.pop()
                elif star:
                    star.pop()
                else:
                    return False
        
        while st and star:
            if st[-1] < star[-1]:
                st.pop()
                star.pop()
            else:
                return False
        
        return len(st) == 0
            

        