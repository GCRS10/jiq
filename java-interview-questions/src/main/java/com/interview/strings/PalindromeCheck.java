package com.interview.strings;

/**
 * Problem: Determine whether a given string is a palindrome, considering
 * only alphanumeric characters and ignoring case.
 * e.g. "A man, a plan, a canal: Panama" -> true
 *
 * Approach: Two-pointer scan from both ends inward, skipping non-alphanumeric
 * characters and comparing lower-cased characters.
 *
 * Time:  O(n)
 * Space: O(1)
 */
public class PalindromeCheck {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeCheck solution = new PalindromeCheck();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
