class Solution:
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:


        queue = deque([])
        visited = defaultdict(bool)
        n = len(grid)
        m = len(grid[0])
        DIR = [[1,0],[-1,0],[0,1],[0,-1]]
        for i in range(n):

            for j in range(m):

                if grid[i][j] == 0:
                    queue.append([i,j,0])
                    visited[(i,j)] = True


        while queue:

            
            
            r,c,level = queue.popleft()
            if level != 0:
                # print(queue)
                grid[r][c] = level
            for dr, dc in DIR:

                nr = dr + r
                nc = dc + c
                if nr < 0 or nc < 0 or nr >=n or nc >=m or grid[nr][nc] == -1:
                    continue
                if visited[(nr,nc)] ==  False:
                    queue.append([nr,nc,level+1])
                    visited[(nr,nc)] = True
        


        
        
        
        


        