import java.util.Stack;

public class Prefix 
{
    public static void infix(String infix)
    {
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0; i<infix.length(); i++)
        {
            char c = infix.charAt(i);
            int ascii = c;
            if(ascii>=48 && ascii<=57)
            {
                val.push(c+"");
            }else if(op.empty())
            {
                op.push(c);
            }else
            {
                if(c=='+' || c=='-')
                {
                    String val2 = val.pop();
                    String val1 = val.pop();
                    String result = op.pop()+val1+val2;

                    op.push(c);
                    val.push(result);
                }else
                {
                    if(op.peek()=='*' || op.peek()=='/')
                    {
                        String val2 = val.pop();
                        String val1 = val.pop();
                        String result = op.pop()+val1+val2;

                        op.push(c);
                        val.push(result);
                    }else
                    {
                        op.push(c);
                    }
                }
            }
        }
        while(val.size()>1)
        {
            String val2 = val.pop();
            String val1 = val.pop();
            String result = op.pop()+val1+val2;
            val.push(result);
        }
        System.out.println(val.pop());
    }
    public static void main(String[] args) {
        infix("9-5+3*4/6");
    }
}
