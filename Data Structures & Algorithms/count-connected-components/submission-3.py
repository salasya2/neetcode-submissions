class DSU:

    def __init__(self, n):
        self.parent = list(range(n+1))
        self.size = [1]*(n+1)
    
    def find(self, node):
        if self.parent[node] != node:
            self.parent[node] = self.find(self.parent[node])
        return self.parent[node]
    
    def union(self, u,v):

        pu = self.find(u)
        pv = self.find(v)

        if pu == pv:
            return False
        
        if self.size[pu] >= self.size[pv]:
            self.size[pu]+=self.size[pv]
            self.parent[pv] = pu
        
        else:
            self.size[pv] += self.size[pu]
            self.parent[pu] = pv
        return True

class Solution:
    def countComponents(self, n: int, edges: List[List[int]]) -> int:

        res = 0
        graph = [[] for i in range(n)]

        dsu = DSU(n)

        for u,v in edges:
            graph[u].append(v)
            graph[v].append(u)

        for i in range(n):

            res += 1

            for v in graph[i]:
                print(i,v)
                if dsu.union(i,v):
                    res-=1
        return res