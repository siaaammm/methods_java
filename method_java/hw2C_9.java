/*
  Write a method called showDiamond that takes an integer number 
  as an argument and then prints a palindromic diamond shape. 
  Moreover, the empty spaces surrounding the diamonds are filled with dots(.) . 
  Note: You must call the methods written in task HW-2A & HW-2B, 
  otherwise this task would be considered invalid.
*/

public class hw2C_9 {
  
    public static int showDots(int numDots) {
      
      for (int i = 0; i < numDots; i++) { 
        System.out.print("."); 
      }
      return numDots;
      
    }
    
    public static int showPalindrome(int len) { 
      
      for (int i = 1; i <= len; i++) { 
        System.out.print(i); 
      }
      for (int i = len - 1; i >= 1; i--) { 
        System.out.print(i); 
      }
      return len;
      
    }
    
    public static int showDiamond(int size) { 
      
      for (int i = 1; i <= size; i++) { 
        showDots(size - i); 
        showPalindrome(i); 
        showDots(size - i); 
        System.out.println();
      }
      
      for (int i = size - 1; i >= 1; i--) { 
        showDots(size - i); // 
        showPalindrome(i);
        showDots(size - i);
        System.out.println();
      }
      return size;
      
    }
    
    public static void main(String[] args) {
      
      showDiamond(3);
      
    }
    
  }
  