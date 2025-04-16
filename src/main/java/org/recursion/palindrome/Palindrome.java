package org.recursion.palindrome;

public class Palindrome {
   public boolean isPalindrome(int i,int n,String s){
      if(i>=n/2){
          return true;
      }
      if(s.charAt(i)==s.charAt(n-i-1)){
          isPalindrome(i+1,n-1,s);
      }

      return true;
   }
}
