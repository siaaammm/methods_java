/*
Write a method called triArea that takes 3 sides of a triangle as 3 integer 
arguments. The method should calculate and print the area of the triangle 
only if it's a valid triangle otherwise print that it's not a valid triangle.
Area of triangle = √[s(s−a)(s−b)(s−c)], where 's' is the semi perimeter 
of the triangle. So, semi-perimeter = s = perimeter/2 = (a + b + c)/2.
Note: You must call the method written in task Evaluation-A, 
otherwise this task would be considered invalid.
*/
public class evaB_9 {
  
    public static boolean isTriangle(int a, int b, int c) {
      
      boolean validity = (a + b > c) && (a + c > b) && (b + c > a);
      return validity;
      
    }
    
    public static int triArea(int a, int b, int c) {
      
      if (isTriangle(a, b, c)) {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(area);
      } else {
        System.out.println("Can’t form triangle");
      }
      return a;
      
    }
    
    public static void main(String[] args) {
      
      triArea(7, 5, 10);
      
    }
    
  }
  