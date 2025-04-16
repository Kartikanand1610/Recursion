package org.recursion.palindrome;

public class Palindrome {

        public boolean isPalindrome(int i, int j, String s) {
            if (i >= j) {
                return true;
            }
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            return isPalindrome(i + 1, j - 1, s);
        }
    }


