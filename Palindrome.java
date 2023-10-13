import java.util.Scanner;

public class Palindrome 
{
    public static boolean isPalindrome(int x)
    {
        String str = String.valueOf(x);
        for(int i=0; i<str.length()/2; i++)
        {
            System.out.println(str.charAt(i)+" : "+str.charAt(str.length()-i-1));
            if(str.charAt(i) != str.charAt(str.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;
        do
        {
            System.out.println("Please enter the number");
            value = sc.nextInt();
            System.out.println(value+" is :"+isPalindrome(value));
        }while(value != 999);
        sc.close();
    }
    
}
