/*
  Write a simple method called showDots that takes a number as an 
  argument  and then prints that amount of dots inside the method.
*/

public class hw2A_9 {
  
    public static int showDots(int numDots) {
      
      for (int i = 0; i < numDots; i++) {
        System.out.print(".");
      }
      System.out.println();
      return numDots;
      
    }
    
    public static void main(String[] args) {
      
      showDots(5); 
      
    }
    
  }
  