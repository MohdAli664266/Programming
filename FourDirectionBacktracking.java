public class FourDirectionBacktracking 
{
    public static void fourTracking(int sr, int sc, int er, int ec, String path, boolean[][] isVisited)
    {
        if(sr>er || sc>ec)return;
        if(sr<0 || sc<0) return;
        if(sr==er && sc == ec)
        {
            System.out.println(path);
            return;
        }
        if(isVisited[sr][sc])return;
        isVisited[sr][sc] = true;

        fourTracking(sr, sc+1, er, ec, path+"R", isVisited);
        fourTracking(sr+1, sc, er, ec, path+"D", isVisited);
        fourTracking(sr-1, sc, er, ec, path+"U", isVisited);
        fourTracking(sr, sc-1, er, ec, path+"L", isVisited);

        //backTracking
        isVisited[sr][sc] = false;
    }
    public static void main(String[] args) 
    {
        int rows = 3;
        int col = 3;
        boolean[][] isVisited = new boolean[rows][col];
        fourTracking(0, 0, rows-1, col-1, "", isVisited);
        
    }
    
}
