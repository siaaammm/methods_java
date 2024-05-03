/*
  Write a method called sequence() that takes an integer in its 
  parameter called n. Now, if n is positive then it prints all the 
  even numbers from 0 to n, otherwise if n is negative it prints a
  ll the odd numbers from n to -1.
  Note: You must call the methods from CW-1B and CW-1C, 
  otherwise this task would be considered invalid.
*/

public class cw1D_9 {
  
    public static boolean isEven(int num) {
      
      boolean a =  num % 2 == 0;
      return a;
        
    }
    
    public static boolean isPos(int num) {
      
      boolean a = num > 0;
      return a;
      
    }
    
    public static int sequence (int n) {
      
      if (n > 0) {
        for (int i = 0; i <= n; i = i+2) {
          System.out.print (i + " ");
        } 
      } else {
        for (int i = n; i <= -1; i = i+2) {
          System.out.print (i + " ");
        }
      }
      return n;
      
    }
    
    public static void main (String [] args) {
      
      sequence(-7);
      
    }
    
  }
  
  