import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<Integer>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return ans;
        }

        int len = words[0].length(); // length of each word
        int totalWords = words.length;
        int sLen = s.length();

        Map<String, Integer> map = new HashMap<String, Integer>(); // map for word frequencies
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Run sliding window for each offset from 0 to len - 1
        for (int i = 0; i < len; i++) {
            Map<String, Integer> copyMap = new HashMap<String, Integer>();
            int left = i;
            int count = 0;

            for (int j = i; j <= sLen - len; j += len) {
                String str = s.substring(j, j + len);

                if (map.containsKey(str)) {
                    copyMap.put(str, copyMap.getOrDefault(str, 0) + 1);
                    count++;

                    // Shrink window if frequency of str exceeds target frequency in map
                    while (copyMap.get(str) > map.get(str)) {
                        String leftStr = s.substring(left, left + len);
                        copyMap.put(leftStr, copyMap.get(leftStr) - 1);
                        count--;
                        left += len;
                    }

                    // Valid concatenation match found
                    if (count == totalWords) {
                        ans.add(left);
                    }
                } else {
                    // Reset window state when encountering an invalid word
                    copyMap.clear();
                    count = 0;
                    left = j + len;
                }
            }
        }

        return ans;
    }
}