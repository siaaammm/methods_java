/* 
  Write a method called evenChecker that takes an integer number 
  as its argument and prints whether the number is even or odd 
  inside the method.
*/

public class cw1A_9 {
  
    public static int evenChecker (int a) { // a = 10
      
      if (a % 2 == 0) { // 10%2 == 0
        System.out.println ("Even!!");
      } else {
        System.out.println ("Odd!!");
      }
      return a;
      
    }
    
    public static void main (String [] args) {
      
      evenChecker (10);
      
    }
    
  }
  