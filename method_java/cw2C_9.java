/*
  Write a method called findSpace that takes two values in its parameters 
  one is an integer diameter and another one is a String. Using the given 
  diameter, this method should calculate the Area of a circle or the Volume 
  of a sphere depending on the value of the second parameter. 
  Finally, it should print the result inside the method.
  Note: You must call the method written in task CW-2A & CW-2B, 
  otherwise this task would be considered invalid
*/


public class cw2C_9 {
  
    public static void findSpace (int r, String b) {
      
      if (b.equals ("circle")) {
        double area  = 3.1416 * r * r;
        System.out.println(area);
      } else if (b.equals ("sphere")) {
        double vol  = 4.0/3.0 * (3.1416 * r * r * r);
        System.out.println(vol);
      } else {
        System.out.println("invalid");
      }
      
    }
    
    public static void main (String [] args) {
      
      findSpace(5, "sphere"); 
      
    }
    
  }
  
  