package com.interview.strings;

/**
 * Problem: Given two strings, determine if one is an anagram of the other.
 * e.g. "listen" and "silent" -> true
 *
 * Approach: If lengths differ, they cannot be anagrams. Otherwise, use a
 * 26-slot frequency array (assuming lowercase a-z); increment for the first
 * string and decrement for the second. If every slot returns to zero, the
 * strings are anagrams.
 *
 * Time:  O(n)
 * Space: O(1) (fixed-size alphabet array)
 */
public class AnagramCheck {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        AnagramCheck solution = new AnagramCheck();
        System.out.println(solution.isAnagram("listen", "silent"));
    }
}
