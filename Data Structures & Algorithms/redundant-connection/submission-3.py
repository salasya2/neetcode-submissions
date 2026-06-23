class Solution:
    def findRedundantConnection(self, edges: List[List[int]]) -> List[int]:

        n = len(edges)

        graph = [[] for i in range(n + 1)]

       

        for u, v in edges:
            graph[u].append(v)
            graph[v].append(u)


        isCyclestart = -1
        cycle = set()
        visited = [False] * (n + 1)

        def dfs(u, par):
            nonlocal isCyclestart

            if visited[u] == True:
                isCyclestart = u
                return True

            visited[u] = True
            for v in graph[u]:
                if v == par:
                    continue
                if dfs(v, u):
                    if isCyclestart != -1:
                        cycle.add(u)
                    if isCyclestart == u:
                        isCyclestart = -1
                    return True
            return False

        

        dfs(1,-1)
        for u, v in reversed(edges):
            if u in cycle and v in cycle:
                return [u, v]

        return []
