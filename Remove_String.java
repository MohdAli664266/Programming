import java.util.Scanner;

public class Remove_String {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String v;
      System.out.println("Enter the string");
      v = sc.nextLine();
      String[] arr = v.split("['!@ .?/|]");
      for(String value:arr)
      {
         System.out.println(value);
      }
      sc.close();
   }
    
}
