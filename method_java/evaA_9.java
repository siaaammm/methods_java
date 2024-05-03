 /*
  Write a method called isTriangle that takes 3 integer numbers as arguments.
  The method will return the boolean True if the 3 sides can form a valid 
  triangle otherwise it’ll return the boolean False.
  Note: In a valid triangle, the sum of any two sides will be greater than
  the third side.
*/

public class evaA_9 {
  
    public static boolean isTriangle(int a, int b, int c) {
      
      boolean validity = (a + b > c) && (a + c > b) && (b + c > a);
      return validity;
      
    }
    
    public static void main(String[] args) {
      
      boolean res = isTriangle(3, 2, 1);
      System.out.println( res );
      
    }
    
  }
  