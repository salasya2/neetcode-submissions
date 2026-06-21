class Solution:
    
    def validTree(self, n: int, edges: List[List[int]]) -> bool:

        graph = [[] for i in range(n)]
        visited = [False] * (n)

        
        
        
        for u,v in edges:
            graph[u].append(v)
            graph[v].append(u)


        def dfs(u,par):

            if visited[u] == True:
                return False
            
            visited[u] = True
            for v in graph[u]:
                if v == par:
                    continue
                if not dfs(v,u):
                    return False
            
            return True
        
        if not dfs(0,-1):
            return False
        if all(visited) == False:
            return False
        return True
            
        
        

        