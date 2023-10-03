import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection 
{
    public static void setFunction()
    {
        Set<Integer> set = new HashSet<>(); //unordered
        set.add(1);
        set.add(2);
        set.add(90);
        set.add(4);
        set.add(9);
        set.add(3);
        System.out.println(set);
        set.add(98);
        set.add(null);
        set.add(null);
        System.out.println(set);
    }
    public static void ordered()
    {
        // Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(56);
        // set.add(null); // invalid in TreeSet<>() but valid in LinkedHashSet<>();
        System.out.println(set);
    }
    public static void main(String[] args) 
    {
        // setFunction();
        ordered();
    }
}
