import java.util.Scanner;

public class CountOccurence {
    
    public static void coutOccurence(int num)
   {
      int arr[] = new int[10];
      for(int i=0; i<arr.length; i++)
      {
         arr[i] = -1;
      }
      while(num!=0)
      {
         int rem = num%10;
         num = num/10;
         arr[rem]++;
      }
      System.out.println("The occurence of the number is written below");
      for(int i = 0; i<arr.length; i++)
      {
         if((arr[i]+1)==0)
         {
            continue;
         }
         System.out.println(i+" = "+ (arr[i]+1)+ " ");
      }
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = 1;
      while(n!=0)
      {
         System.out.println("Enter the number for check");
         n = sc.nextInt();
         coutOccurence(n);
      }
      sc.close();
   }
}
