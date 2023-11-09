import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PermutaionFGF
{
    public static void permutation(String str, String container, List<String> list)
    {
        if(str.equals(""))
        {
            if(list.contains(container))
            {
               return;
            }
            list.add(container);
            return;
        }
        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            permutation(left+right, container+c, list);
        }
    }
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        permutation("ljr", "", list);
        Collections.sort(list);
        System.out.println(list);
        // ljr input
        // ljr lrj jlr jrl rlj rjl my output
        // jlr jrl ljr lrj rjl rlj real output
    }
}