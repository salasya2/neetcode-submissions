class DSU:
    def __init__(self,n):
        self.parent = list(range(n+1))
        self.size = [1]*(n+1)
    
    def find(self, node):
        if self.parent[node]!=node:
            self.parent[node] = self.find(self.parent[node])
        
        return self.parent[node]
    
    def union(self, u,v):
        pu = self.find(u)
        pv = self.find(v)

        if pu == pv:
            return False
        
        # if self.size[pu] >= self.size[pv]:
        self.size[pu] += self.size[pv]
        self.parent[pv] = pu
        # else:
        #     self.size[pv] += self.size[pu]
        #     self.parent[pu] = pv
        return True

class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:

            res = 0
            n = len(grid)
            m = len(grid[0])
            directions = [[0,1],[0,-1],[1,0],[-1,0]]
            dsu = DSU(n*m)

            def index(r,c):
             
               return r*m + c

            for i in range(n):
                for j in range(m):

                    if grid[i][j] == 1:

                        res = max(res, dsu.size[index(i,j)])
                        for dr,dc in directions:

                            nr = i + dr
                            nc = j + dc

                            if nr >= n or nc >= m or nr < 0 or nc < 0 or grid[nr][nc] == 0:
                                continue
                            if dsu.union(index(nr,nc),index(i,j)):
                                res = max(res, dsu.size[index(nr,nc)])
            
            return res




