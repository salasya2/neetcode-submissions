class Solution:
    def validTree(self, n: int, edges: List[List[int]]) -> bool:

        if (n - 1) < len(edges):
            return False

        graph = [[] for i in range(n)]
        visited = [False] * n

        for u,v in edges:
            graph[u].append(v)
            graph[v].append(u)

        q = deque()
        q.append([0,-1])

        while q:
            u, par = q.popleft()
            if visited[u] == True:
                return False
            visited[u] = True
            for v in graph[u]:
                if par == v:
                    continue
                q.append([v,u])
                
                
        if all(visited) == False:
            return False
        return True

                