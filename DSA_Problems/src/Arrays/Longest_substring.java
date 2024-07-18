package Arrays;

import java.util.HashMap;

public class Longest_substring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                // If the character is already in the HashMap, update the start pointer
                // to the next index after the last occurrence of this character.
                start = Math.max(map.get(c) + 1, start);
            }
            // Update the last seen index of the character.
            map.put(c, end);
            // Update the maximum length of the substring without repeating characters.
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest substring length without repeating characters: " + lengthOfLongestSubstring(s)); 
    }
}

