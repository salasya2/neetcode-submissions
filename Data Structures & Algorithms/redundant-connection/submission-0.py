class Solution:
    def findRedundantConnection(self, edges: List[List[int]]) -> List[int]:

        n = len(edges)

        graph = [[] for i in range(n+1)]
        indegree =[0]*(n+1)
        for u,v in edges:
            graph[u].append(v)
            graph[v].append(u)
            indegree[u] +=1
            indegree[v] +=1
        
        q = deque()

        for i in range(1,n+1):
            if indegree[i] == 1:
                q.append(i)

        while q:

            u = q.popleft()
            indegree[u] -= 1
            for v in graph[u]:
                indegree[v] -= 1
                if indegree[v] == 1:
                    q.append(v)
        
        for u,v in reversed(edges):

            if indegree[u] == 2 and indegree[v]:
                return [u,v]
        return []
        