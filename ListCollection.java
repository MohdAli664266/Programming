import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListCollection
{
    public static void linkedList()
    {
        List<Integer> list = new LinkedList<>(); // order preserved
        list.add(1);
        list.add(2);
        list.add(54);
        list.add(1);
        list.add(null); //valid
        System.out.println(list);
        System.out.println(list.contains(1));
        System.out.println(list.indexOf(1));
        list.clear();
        System.out.println(list);
    }
    public static void arrayList()
    {
        List<Integer> list = new ArrayList<>(); //order preserved
        list.add(1);
        list.add(2);
        list.add(89);
        list.add(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.remove(1));
        System.out.println(list.get(1));
        System.out.println(list);
        list.clear();
        list.add(null); //valid
        System.out.println(list);
    }
    public static void main(String[] args) 
    {
        // linkedList();
        arrayList();
    }
}