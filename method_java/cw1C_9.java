/*
  Write a method called isPos that takes an integer number 
  as an argument and returns boolean true if the number is 
  positive otherwise returns boolean false.
*/

public class cw1C_9 {
    public static boolean isPos(int num) {
      
      boolean a = num > 0;
      return a;
      
    }
    
    public static void main(String[] args) {
      
      boolean result = isPos(12);
      System.out.println( result );
         
    }
    
  }
  