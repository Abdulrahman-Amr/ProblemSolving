class Solution {
    public boolean isValidSudoku(char[][] board) {
            int rows[]=new int[10];
        int cols[]=new int[10];
        Arrays.fill(rows, 0);
         Arrays.fill(cols, 0);
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!=46)
                {
                    rows[board[i][j]-48]++;
                    if(rows[board[i][j]-48] >1)
                    {
                        return false;
                    }
                }
                 if(board[j][i]!=46)
                 {
                    cols[board[j][i]-48]++;
                    if(cols[board[j][i]-48] >1)
                    {
                        return false;
                    }
                 }
            }
               Arrays.fill(rows, 0);
                Arrays.fill(cols, 0);
        }
        Arrays.fill(cols, 0);
        for(int i=0;i<9;i+=3)
        {
            
            for(int j=0;j<9;j+=3)
            {
                Arrays.fill(cols, 0);
               for(int k=j;k<j+3;k++)
            {
                for(int l=i;l<i+3;l++)
            {
                 if(board[k][l]!=46)
                {
                    cols[board[k][l]-48]++;
                    if(cols[board[k][l]-48] >1)
                    {
                        return false;
                    }
                }
            }
            } 
            }
        }
        return true;
    }
}