package org.recursion.palindrome;

public class Main {
    public static void main(String[] args){
        String s="MADAM";
        Palindrome palindrome=new Palindrome();
        System.out.println(palindrome.isPalindrome(0,s.length()-1,s));
    }
}
