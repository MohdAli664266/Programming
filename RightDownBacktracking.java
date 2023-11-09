public class RightDownBacktracking 
{
    public static void twoDBackTracking(int sr, int sc, int er, int ec, String path)
    {
        if(sr>er || sc> ec)
        {
            return;
        }
        if(sr==er && sc == ec)
        {
            System.out.println(path);
            return;
        }
        twoDBackTracking(sr, sc+1, er, ec, path+"R");
        twoDBackTracking(sr+1, sc, er, ec, path+"D");
    }
    public static void main(String[] args) 
    {
        int er = 2;
        int ec = 2;
        twoDBackTracking(0, 0, er-1, ec-1, "");
    }
    
}
