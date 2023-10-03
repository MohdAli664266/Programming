import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollection
{
    public static void priorityQueue()
    {
        // Queue<Integer> queue = new PriorityQueue<>(); //default min priority
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder()); // highest element comes first
        queue.add(12);
        queue.add(1);
        queue.add(2);
        System.out.println(queue);
        System.out.println(queue.poll()); //retrieve head element and removes that element
        // System.out.println(queue.element()); //retrieve head element but does not remove that element
        System.out.println(queue);
        Object[] sarr = queue.toArray();
        for(int i=0; i<sarr.length; i++)
        {
            System.out.println(sarr[i]);
        }
        // System.out.println(queue.remove()); //if PriorityQueue is empty, throws and exception        
    }
    public static void main(String[] args) {
        priorityQueue();
    }
    
}
