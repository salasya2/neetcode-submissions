class Solution:
    def findRedundantConnection(self, edges: List[List[int]]) -> List[int]:

        n = len(edges)

        graph = [[] for i in range(n+1)]

        
        
        def dfs(u, par):

            if visited[u] == True:
                return True
            
            visited[u] = True
            for  v in graph[u]:
                if v == par:
                    continue
                
                if dfs(v,u):
                    return True
            return False
        
        for u,v in edges:
            graph[u].append(v)
            graph[v].append(u)

            visited = [False] * (n+1)

            if dfs(u,-1):
                return [u,v]
        
        return []
        