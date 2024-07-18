package Arrays;

import java.util.*;


class AnagramGroup {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        AnagramGroup solution = new AnagramGroup();
        
        // Example input
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        // Call the groupAnagrams method
        List<List<String>> result = solution.groupAnagrams(input);
        
        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
