package com.interview.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Given a string, find the length of the longest substring without
 * repeating characters.
 * e.g. "abcabcbb" -> 3 ("abc")
 *
 * Approach: Sliding window with a HashMap of character -> last seen index.
 * Expand the window's right edge; whenever a repeat is found inside the
 * current window, jump the left edge just past its previous occurrence.
 *
 * Time:  O(n)
 * Space: O(min(n, alphabet size))
 */
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }
            lastSeen.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstring solution = new LongestSubstring();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
    }
}
