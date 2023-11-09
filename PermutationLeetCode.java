import java.util.ArrayList;
import java.util.List;

public class PermutationLeetCode 
{
    public static void permutation(int[] arr, List<Integer> container, boolean[] isVisited, List<List<Integer>> list)
    {
        if(arr.length==container.size())
        {
            List<Integer> lst = new ArrayList<>();
            for(int i=0; i<arr.length; i++)
            {
                lst.add(container.get(i));
            }
            list.add(lst);
            return;
        }

        for(int i=0; i<arr.length; i++)
        {
            if(isVisited[i]==false)
            {
                isVisited[i] = true;
                int val = arr[i];
                container.add(val);
                permutation(arr, container, isVisited, list);
                isVisited[i] = false;
                container.remove(container.size()-1);
            }
        }
    }
    public static void main(String[] args) 
    {
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = {1, 2};
        boolean[] isVisited = new boolean[arr.length];
        List<Integer> container = new ArrayList<>();
        permutation(arr, container, isVisited, list);
        System.out.println(list);
    }
    
}
