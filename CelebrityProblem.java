import java.util.Stack;

public class CelebrityProblem 
{
    public static void celebrity(int[][] mat)
    {
        Stack<Integer> stack = new Stack<>();
        int len = mat.length;
        for(int i=0; i<len; i++)
        {
           stack.push(i);
        }
        while(stack.size()>1)
        {
            int val1 = stack.pop();
            int val2 = stack.pop();
            if(mat[val1][val2]==0)
            {
                stack.push(val1);
            }else if(mat[val2][val1]==0)
            {
                stack.push(val2);
            }
        }
        int value = stack.pop();
        for(int i=0; i<len; i++)
        {
            if(value==i)
            {
                continue;
            }
            if(mat[value][i]!=0)
            {
                System.out.println("Not celebrity");
                break;
            }
        }
        for(int i=0; i<len; i++)
        {
            if(value==i)
            {
                continue;
            }
            if(mat[i][value]==0)
            {
                System.out.println("Not celebrity");
                break;
            }
        }
        System.out.println("Celebrity "+value);
    }
    public static void main(String[] args)
    {
        int[][] arr = {{0, 1, 0},
                       {0, 0, 0},
                       {0, 1, 0}};
        celebrity(arr);
    }
    
}
