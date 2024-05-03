/*
  Write a method called show_palindrome that takes a number as an 
  argument and then prints a palindrome inside the method.
*/

public class hw2B_9 {
  
    public static int showPalindrome(int len) { 
      
      for (int i = 1; i <= len; i++) { 
        System.out.print(i); 
      }
      for (int i = len - 1; i >= 1; i--) { 
        System.out.print(i); 
      }
      System.out.println();
      return len;
      
    }
    
    public static void main(String[] args) {
      
      showPalindrome(5); 
      
    }
    
  }
  
  