import java.util.Stack;

public class Bodmas 
{
    public static void calculation(String expression)
    {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0; i<expression.length(); i++)
        {
            char ch = expression.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii <=57)
            {
                val.push(ascii-48);
            }else if(op.empty() || op.peek()=='(' || ch=='(')
            {
                op.push(ch);
            }else
            {
                if(ch=='-' || ch=='+')
                {
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if(op.peek()=='-') val.push(val1-val2);
                    if(op.peek()=='+') val.push(val1+val2);
                    if(op.peek()=='/') val.push(val1/val2);
                    if(op.peek()=='*') val.push(val1*val2);
                    op.pop();
                    op.push(ch);
                }
                else if(ch=='/' || ch=='*')
                {
                    if(op.peek()=='/' || op.peek()=='*')
                    {
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if(op.peek()=='/') val.push(val1/val2);
                        if(op.peek()=='*') val.push(val1*val2);
                        op.pop();
                        op.push(ch);
                    }else
                    {
                        op.push(ch);
                    }
                }else
                {
                    while(op.peek()!='(')
                    {
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if(op.peek()=='-') val.push(val1-val2);
                        if(op.peek()=='+') val.push(val1+val2);
                        if(op.peek()=='/') val.push(val1/val2);
                        if(op.peek()=='*') val.push(val1*val2);
                        op.pop();
                    }
                    op.pop();
                }
            }
        }
        while(val.size()>1)
        {
            int val2 = val.pop();
            int val1 = val.pop();
            if(op.peek()=='+') val.push(val1+val2);
            if(op.peek()=='-') val.push(val1-val2);
            if(op.peek()=='/') val.push(val1/val2);
            if(op.peek()=='*') val.push(val1*val2);
            op.pop();
        }
        System.out.println(val.pop());
    }
    public static void main(String[] args) {
        calculation("9-(5+3)*4/6");
    }
    
}
