import java.util.Scanner;

class Pin_Quiz
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        String a = sc.nextLine();
        System.out.println("Enter the value of b");
        String b = sc.nextLine();
        System.out.println("Enter the value of c");
        String c = sc.nextLine();
        sc.close();
        int[] arr = new int[3];
        int[] brr = new int[3];
        int[] crr = new int[3];
        int greater=0;
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<a.length(); i++)
        {
            arr[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
            brr[i] = Integer.parseInt(String.valueOf(b.charAt(i)));
            crr[i] = Integer.parseInt(String.valueOf(c.charAt(i)));
            
            int p[] =new int[]{arr[i], brr[i], crr[i]};
            int min = p[0];
            for(int j=0; j<p.length; j++)
            {
                if(min>p[j])
                {
                    min = p[j];
                }
                if(greater<p[j])
                {
                    greater = p[j];
                }
            }
            sb.append(min);
        }
        result.append(greater);
        result.append(sb);
        System.out.println("Your pin : "+result);
        
    }
}