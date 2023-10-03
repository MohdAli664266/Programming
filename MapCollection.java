import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection 
{
    public static void unOrderedMap()
    {
        Map<String, Integer> map = new HashMap<>(); //Unordered map
        map.put("Ali", 24);
        map.put("Anil", 23);
        map.put("Abbas", 23);
        System.out.println(map);
        map.put("Anil", 04); //update value of anil
        // map.put(null, null); //not allowed 
        System.out.println(map);
        System.out.println();
        for(var m:map.entrySet()) //first loop for iteration with key-value
        {
            System.out.println(m.getKey()+" = "+m.getValue());
        }
        System.out.println();
        for(String key:map.keySet()) //second loop for iteration with only key
        {
            System.out.println(key+" = "+map.get(key));
        }
        System.out.println();
        for(int value : map.values()) // all values will come one by one
        {
            System.out.println(value);
        }
    }
    public static void orderPreservedMap()
    {
        //preserved means, key-value will display in the same order as you insert an entry
        Map<String, Integer> map = new LinkedHashMap<>(); //orderPreserved
        map.put("A", 1);
        map.put("B", 2);
        map.put("Ali", 23);
        map.put("C", 3);
        System.out.println(map);
        map.put("C", 9); //update the value of c
        map.put(null, null); //valid
        map.put(null, 1); //update value of null by 1
        System.out.println(map);
        map.putIfAbsent("Ali", 24); //if key does not exist, it wil be add
        // map.clear(); //delete all entryset in the map
        System.out.println(map.remove("Ali"));
        System.out.println(map);
    }
    public static void ordered()
    {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Ali", 1);
        map.put("Anas", 2);
        map.put("1", null);
        System.out.println(map);
        // map.put(null, null); // key=null is not allowed
        map.put("1", 25);
        System.out.println(map);
    }
    public static void main(String[] args) 
    {
        // unOrderedMap(); 
        // orderPreservedMap();
        ordered();
    }
}
