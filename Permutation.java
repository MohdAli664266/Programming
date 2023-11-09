public class Permutation 
{
    public static void permutation(String str, String finalString)
    {
        if(str.equals(""))
        {
            System.out.println(finalString);
            return;
        }

        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            permutation(left+right, finalString+c);
        }
    }
    public static void main(String[] args) 
    {
        permutation("abc", "");
    }
    
}