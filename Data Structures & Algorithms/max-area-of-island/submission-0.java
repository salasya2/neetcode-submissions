class Solution {
    
    public static int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int Area=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    Area=Math.max(Area,dfs(grid,i,j));
                }
            }
        }
        return Area;
    }

    private int dfs(int[][] grid, int r, int c)
    {
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0)
            return 0;


        grid[r][c]=0;
        int res=1;
        for(int[] row : directions)
        {
            res+=dfs(grid,r+row[0],c+row[1]);
        }
        return res;
    }
}
