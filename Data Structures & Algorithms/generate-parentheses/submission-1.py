class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []

        s = []

        
        def dfs(s,Open,closed):
            if n * 2 == len(s):
                res.append("".join(s))
                return
            
            if Open < n:
                s.append("(")
                dfs(s, Open+1, closed)
                s.pop()
            
            if closed < Open:
                s.append(")")
                dfs(s, Open,closed+1)
                s.pop()

            

        dfs(s,0,0)
        return res        