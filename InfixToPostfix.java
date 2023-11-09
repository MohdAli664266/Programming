import java.util.Stack;

public class InfixToPostfix 
{
    public static void expression(String exp)
    {
        char ch;
        boolean flag = false;

        for(int i=0; i<exp.length(); i++)
        {
            ch = exp.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                if(ch>=97 && ch<=122)
                {
                    flag = true;
                }
                break;
            }
        }
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        exp = exp.toLowerCase();
        for(int i=0; i<exp.length(); i++)
        {
            char c = exp.charAt(i);
            if(c>=97 && c<=122)
            {
                val.push(c+"");
            }else if(c>=48 && c<=57)
            {
                int v = c-48;
                val.push(v+"");
            }
            else if(op.empty() || c=='(' || op.peek()=='(')
            {
                if(c==')')
                {
                    while (op.peek()!='(') 
                    {
                        String val2 = val.pop();
                        String val1 = val.pop();
                        String result = val1+val2+op.pop();
                        val.push(result);
                    }
                    op.pop();
                }
                else
                {
                    op.push(c);
                }
            }else
            {
                if(c=='-' || c=='+')
                {
                    
                    while (op.size()!=0 && op.peek()!='(')
                    {
                        String val4 = val.pop();
                        String val3 = val.pop();
                        String results = val3+val4+op.pop();
                        val.push(results); 
                    }
                    op.push(c);
                }else if(c=='*' || c=='/')
                {
                    if(op.peek()=='*' || op.peek()=='/')
                    {
                        String val2 = val.pop();
                        String val1 = val.pop();
                        String result = val1+val2+op.pop();
                        val.push(result);
                        op.push(c);
                    }else
                    {
                        op.push(c);
                    }
                }else if(c=='^')
                {
                    if(op.peek()=='^')
                    {
                        String val2 = val.pop();
                        String val1 = val.pop();
                        String result = val1+val2+op.pop();
                        val.push(result);
                    }
                    op.push(c);
                }else
                {
                    while (op.peek()!='(') 
                    {
                        String val2 = val.pop();
                        String val1 = val.pop();
                        String result = val1+val2+op.pop();
                        val.push(result);
                    }
                    op.pop();
                }
            }
        }
        while(val.size()>1)
        {
            String val2 = val.pop();
            String val1 = val.pop();
            String result = val1+val2+op.pop();
            val.push(result);
        }
        if(!flag)
        {
            System.out.println(val.pop().toUpperCase());
        }else
            System.out.println(val.pop());
    }
    public static void main(String[] args) {
        String exp = "h^m^q^(7-4)";
        expression(exp);
    }
}
