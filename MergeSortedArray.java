import java.util.Arrays;

public class MergeSortedArray 
{
    public static void merge(int[] first, int[] second)
    {
        int[] container = new int[first.length+second.length];
        int k=0, i=0, j=0;
        while(i<first.length)
        {
            container[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length)
        {
            container[k] = second[j];
            j++;
            k++;
        }
        Arrays.sort(container);
        for(int l=0; l<container.length; l++)
        {
            System.out.print(container[l]+" ");
        }
    }
    public static void main(String[] args) 
    {
        int first[] = {0, 2, 3, 8, 9};
        int[] second = {2, 4, 8, 9};
        merge(first, second);
    }
    
}
