import java.util.Stack;

class nextGreaterElement
{
    public static void nextGreater(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        for(int i = arr.length-1; i>=0; i--)
        {
            res[i] = -1;
            if(stack.size()==0)
                stack.push(arr[i]);
            else if(arr[i]<stack.peek())
            {
                res[i] = stack.peek();
                stack.push(arr[i]);
            }else
            {
                while(stack.size()!=0 && stack.peek()<arr[i])
                {
                    stack.pop();
                }
                stack.push(arr[i]);
            }        
        }
        for(int i=0; i<res.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<res.length; i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {10, 3, 9, 2, 5, 8};
        nextGreater(arr);
    }
}