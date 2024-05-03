/*
  Write a method called isPerfect which takes an integer in its parameter
  to check whether a number is perfect or not. If the number is perfect then
  the method returns boolean true otherwise it returns boolean false.
*/

public class hw1B_9 {
  
    public static boolean isPerfect(int num) {
      
      int sum = 0;
      for (int i = 1; i < num; i++) {
        if (num % i == 0) {
          sum += i;
        }
      }
      
      boolean isPerfect = sum == num;
      return isPerfect;
      
    }
    
    public static void main(String[] args) {
      
      boolean check = isPerfect(33);
      System.out.println(check);
      
      
    }
    
  }
  