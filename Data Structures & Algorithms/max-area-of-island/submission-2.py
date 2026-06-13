class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:

        res = 0
        count = 0
        n = len(grid)
        m = len(grid[0])

        dr = [[0, 1], [0, -1], [1, 0], [-1, 0]]

        def dfs(i, j):

            nonlocal n, m, count

            if i >= n or j >= m or i < 0 or j < 0 or grid[i][j] == 0:
                return

            grid[i][j] = 0
            count += 1

            for di, dj in dr:

                nr = di + i
                nc = dj + j
                dfs(nr, nc)

        for i in range(n):
            for j in range(m):
                count = 0
                if grid[i][j] == 1:
                    dfs(i, j)
                    res = max(res, count)

        return res
