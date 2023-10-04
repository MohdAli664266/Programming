import java.util.HashMap;
import java.util.Map;

public class RomanToInteger 
{
    public static void romanToInteger(String roman)
    {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int value = 0;
        for(int i=roman.length()-1; i>=0; i--)
        {
            int currValue = romanMap.get(roman.charAt(i));
            if(i<roman.length()-1 && currValue<romanMap.get(roman.charAt(i+1)))
            {
                value -=currValue;
            }else
            {
                value +=currValue;
            }
        }
        System.out.println(roman+" to integer "+value);
    }
    public static void main(String[] args) {
        romanToInteger("XXV");
    }
    
}
