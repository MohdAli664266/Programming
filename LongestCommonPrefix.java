import java.util.Arrays;

public class LongestCommonPrefix 
{
    public static String longestCommonPrefix(String[] arr)
    {
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        String result = "";
        for(int i=0; i<Math.min(first.length(), last.length()); i++)
        {
            if(first.charAt(i) != last.charAt(i))
            {
                return result;
            }
            result +=first.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) 
    {
        String[] arr = {"Hello", "Hey", "Henna"};
        String value = longestCommonPrefix(arr);
        System.out.println(value);
    }
    
}
