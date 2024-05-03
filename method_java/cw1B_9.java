/*
  Write a method called isEven that takes an integer number as an 
  argument and returns boolean true if the number is even otherwise 
  returns boolean false.
*/

public class cw1B_9 {
    public static boolean isEven(int num) {
      
      boolean a =  num % 2 == 0;
      return a;
        
    }
    
    public static void main(String[] args) {
      
      boolean result = isEven(17);
      System.out.println( result );
      
    }
    
  }
  