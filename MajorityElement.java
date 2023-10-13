import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement 
{
    public static List<Integer> majorityElement(int[] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }else
            {
                map.put(arr[i], 1);
            }
        }

        for(int key : map.keySet())
        {
            if(map.get(key)>arr.length/3)
            {
                list.add(key);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 3, 4, 4, 4, 3, 3};
        List<Integer> list = majorityElement(arr);
        System.out.println(list);
    }
    
}
