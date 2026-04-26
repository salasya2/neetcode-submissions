class Solution {
    int[][] traverse = {{0,1},{0,-1},{1,0},{-1,0}};
    public boolean exist(char[][] board, String word) {
        
        int n=board.length;
        
        int m=board[0].length;

        int index=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(word.charAt(index)==board[i][j])
                {
                    if(dfs(board,word,i,j,index))
                        return true;
                }
            }
        }

        return false;

    }

    public boolean dfs(char[][] board, String word, int i,int j,int index)
    {
        if(index==word.length())
            return true;
        
        if(i<0 || j<0 || i>=board.length || j>= board[0].length || word.charAt(index)!=board[i][j])
            return false;
        
        char c=board[i][j];
        board[i][j]='_';

        for(int l=0;l<4;l++)
        {
            int new_i=i+traverse[l][0];
            int new_j=j+traverse[l][1];

            if(dfs(board,word,new_i,new_j,index+1))
                return true;
        }

        board[i][j]=c;
        return false;
    }
}
