/*
  Write a method called circleArea that takes an integer radius 
  in its parameter and returns the area of the circle.
*/

public class cw2A_9 {
  
    public static double circleArea (int r) {
      
      double area  = 3.1416 * r * r;
      return area;
      
    }
    
    public static void main (String [] args) {
      
      double area = circleArea(5);
      System.out.println(area);
  
    }
    
  }
  
  