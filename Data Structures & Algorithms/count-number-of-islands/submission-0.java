class Solution {
    private static int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    res++;
                }
            }
        }

        return res; 
    }

    private void dfs(char[][] grid,int r,int c)
    {

        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c]=='0' )
            return ;

        grid[r][c]='0';
        for(int[] row :directions)
        {
            dfs(grid,r+row[0],c+row[1]);
        }


    } 
}
