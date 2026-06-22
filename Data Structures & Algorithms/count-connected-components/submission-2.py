class Solution:
    def countComponents(self, n: int, edges: List[List[int]]) -> int:

        res = 0

        graph = [[] for i in range(n)]

        for u,v in edges:
            graph[u].append(v)
            graph[v].append(u)
        
        visited={ i:False for i in range(n)}

        def dfs(u):
            
            for v in graph[u]:

                if visited[v] == False:
                    visited[v] = True
                    dfs(v)

        
        for i in range(n):

            if visited[i] == False:
                visited[i] = True
                dfs(i)
                res+=1
        
        return res
        