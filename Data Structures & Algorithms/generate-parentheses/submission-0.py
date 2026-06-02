class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []

        def isvalid(s):
            Open = 0
            closed = 0

            for c in s:
                if c == '(':
                    Open += 1
                
                if c == ')':
                    closed +=1
                if closed > Open:
                    return False 
            
            if closed != Open:
                return False
            return True

        
        def dfs(s):
            if n * 2 == len(s):
                if isvalid(s):
                    res.append(s)
                return
            
            dfs(s + '(')
            dfs(s + ')')

        dfs("")
        return res        