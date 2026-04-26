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
                    Area=Math.max(Area,bfs(grid,i,j));
                }
            }
        }
        return Area;
    }

    private int bfs(int[][] grid, int r,int c)
    {
        Queue<int[]> q=new LinkedList<>();

        grid[r][c]=0;
        q.add(new int[]{r,c});

        int res=1;

        while(!q.isEmpty())
        {
            int[] node = q.poll();
            int row=node[0];
            int col=node[1];

            for(int[] dir : directions)
            {
                int new_row=dir[0]+row;
                int new_col=dir[1]+col;

                if(new_row<grid.length && new_row>=0 && new_col < grid[0].length && new_col>=0 && grid[new_row][new_col]==1 )
                {
                    res++;
                    q.add(new int[]{new_row,new_col});
                    grid[new_row][new_col]=0;
                }
            }
            
        }
        return res;

    }
}
