package Day24;

import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length())
            return result;

        int[] count = new int[26];

        for (char c : p.toCharArray())
            count[c - 'a']++;

        int left = 0, right = 0;

        while (right < s.length()) {
            count[s.charAt(right) - 'a']--;

            while (count[s.charAt(right) - 'a'] < 0) {
                count[s.charAt(left) - 'a']++;
                left++;
            }

            if (right - left + 1 == p.length())
                result.add(left);

            right++;
        }

        return result;
    }
}