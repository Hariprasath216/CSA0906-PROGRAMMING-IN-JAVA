import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        // Test Cases
        System.out.println(romanToInt("III"));     // Output: 3
        System.out.println(romanToInt("LVIII"));   // Output: 58
        System.out.println(romanToInt("MCMXCI"));  // Output: 1991
        System.out.println(romanToInt("V"));       // Output: 5
        System.out.println(romanToInt("LZAII"));   // Output: -1 (Invalid Roman numeral)
        System.out.println(romanToInt("MCCDTIV")); // Output: -1 (Invalid Roman numeral)
    }

    public static int romanToInt(String s) {
        // Create a map to store the values of Roman numerals
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.getOrDefault(currentChar, 0);

            if (i < s.length() - 1) {
                char nextChar = s.charAt(i + 1);
                int nextValue = romanValues.getOrDefault(nextChar, 0);

                // Check if subtraction rule applies
                if (currentValue < nextValue) {
                    result += (nextValue - currentValue);
                    i++; // Skip the next character as it has been considered
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }
}
