public class FourDirectionBacktrackingOptimized 
{
    public static void optimized(int sr, int sc, int er, int ec, String path, int[][] block)
    {
        if(sr>er || sc>ec) return;
        if(sr<0 || sc<0) return;
        if(sr==er && sc==ec)
        {
            System.out.println(path);
            return;
        }
        if(block[sr][sc]==0)return;
        if(block[sr][sc]==-1)return;
        block[sr][sc] = -1;
        optimized(sr, sc+1, er, ec, path+"R", block);
        optimized(sr, sc-1, er, ec, path+"L", block);
        optimized(sr-1, sc, er, ec, path+"U", block);
        optimized(sr+1, sc, er, ec, path+"D", block);
        //backtracking
        block[sr][sc] = 1;
    }
    public static void main(String[] args) 
    {
        int rows = 3;
        int col = 4;
        int[][] arr = {{1, 0, 1, 1},
                       {1, 1, 1, 1},
                       {1, 1, 0, 1}};
        optimized(0, 0, rows-1, col-1, "", arr);
        
    }
    
}
