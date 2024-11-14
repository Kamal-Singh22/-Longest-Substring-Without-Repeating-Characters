import java.util.*;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
       
        Map<Character, Integer> map = new HashMap<>();
        
        int maxLength = 0;
        int start = 0;
        
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
           
            if (map.containsKey(currentChar)) {
               
                start = Math.max(start, map.get(currentChar) + 1);
            }
            
          
            map.put(currentChar, end);
            
           
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}
