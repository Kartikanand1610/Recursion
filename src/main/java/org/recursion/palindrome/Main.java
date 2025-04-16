package org.recursion.palindrome;

public class Main {
    public static void main(String[] args){
        String s = "MADAM";
        int i=0;
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(i, s.length()-1-i-1, s);
        System.out.println("Is palindrome: " + result);
    }
}
