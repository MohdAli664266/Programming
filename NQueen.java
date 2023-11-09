public class NQueen
{
    public static void nqueen(char[][] board, int row)
    {
        int n= board.length;
        if(n==row)
        {
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0; j<n; j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j] = 'Q';
                nqueen(board, row+1);
                board[row][j] = 'x';
            }
        }
    }
    private static boolean isSafe(char[][] board, int row, int col) 
    {
        int n = board.length;
        for(int i=0; i<n; i++)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        for(int j=0; j<n; j++)
        {
            if(board[row][j]=='Q')
            {
                return false;
            }
        }
        int i=row;
        int j= col;
        //SE
        while(i<n && j<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i++;
            j++;
        }
        i=row;
        j= col;
        //SW
        while(i<n && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i++;
            j--;
        }
        i=row;
        j= col;
        //NW
        while(i>=0 && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j--;
        }
        i=row;
        j= col;
        //NE
        while(i>=0 && j<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int n = 6;
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                board[i][j] = 'x';
            }
        }
        nqueen(board, 0);
        
    }    
}