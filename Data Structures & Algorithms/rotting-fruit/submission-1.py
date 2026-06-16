class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:

        res = 0

        queue = deque([])

        n = len(grid)
        m = len(grid[0])
        visited = defaultdict(bool)

        for i in range(n):

            for j in range(m):

                if grid[i][j] == 2:

                    queue.append([i,j])
                    visited[(i,j)] = True
        
        
        DIR = [[0,1],[1,0],[-1,0],[0,-1]]
        while queue:
            print(queue,"\t level : ",res,"\n-------------")
            for i in range(len(queue)):
                r,c = queue.popleft()

                for dr,dc in DIR:

                    nr , nc  = r + dr, c + dc

                    if nr < 0 or nc < 0 or nr >= n or nc >= m or grid[nr][nc] != 1 or visited[(nr,nc)] == True:
                        continue
                    
                    queue.append([nr,nc])
                    visited[(nr,nc)] = True
                    grid[nr][nc] = -1
            res += 1
            
        # print(grid)
        # print(visited)
        for i in range(n):
            for j in range(m):
                if grid[i][j] == 1:
                    return -1
        if res == 0:
            return 0
        return res - 1

            
        