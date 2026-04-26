class Solution {
    
    boolean flag=false;
    
    int[][] traverse=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};

    public boolean exist(char[][] board, String word) {
        
        int n=board.length;
        int m=board[0].length;
        String temp="";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    dfs(board,word,temp,i,j,n,m,1);
                }
            }
        }
        return flag;
    }
    public void dfs(char[][] board,String word, String temp,int i, int j, int n, int m,int index)
    {
        
        if(i>=n || j>=m || i<0 || j<0) return;
        if(index>word.length() || temp.length()>word.length()) return;

        
        char c=board[i][j];

        temp+=c;

        if(word.equals(temp)) 
        {
            System.out.println(temp);
            flag=true;
            return;
        }

        

        board[i][j]='_';

        

        for(int l=0;l<4;l++){

            int new_i=i+traverse[l][0];
            int new_j=j+traverse[l][1];

            if(new_i<n && new_j<m && new_i>=0 && new_j>=0 &&  word.charAt(index)==board[new_i][new_j])
            {    
                dfs(board,word,temp,new_i,new_j,n,m,index+1);                
            }
            if(flag) return;
        }


        

        if(temp.length()>0)
            temp=temp.substring(0,temp.length()-1);

        board[i][j]=c;

        return;
    }
}
